package com.github.voml.jss_intellij.ide.formatter

import com.github.voml.jss_intellij.language.JssLanguage
import com.github.voml.jss_intellij.language.psi.JssTypes
import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiErrorElement
import com.intellij.psi.TokenType
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CommonCodeStyleSettings
import com.intellij.psi.formatter.FormatterUtil

class JssAstBlock(
    private val node: ASTNode,
    private val alignment: Alignment?,
    private val indent: Indent?,
    private val wrap: Wrap?,
    val ctx: VomlFormatterContext
) : ASTBlock {
    override fun isLeaf(): Boolean = node.firstChildNode == null

    override fun getNode() = node

    override fun getTextRange(): TextRange = node.textRange

    override fun getWrap() = wrap

    override fun getIndent() = indent

    override fun getAlignment() = alignment

    override fun getSpacing(child1: Block?, child2: Block) = computeSpacing(child1, child2, ctx)

    override fun getSubBlocks(): List<Block> = mySubBlocks

    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        val indent = when (node.elementType) {
            JssTypes.TABLE -> Indent.getNormalIndent()
            else -> Indent.getNoneIndent()
        }
        return ChildAttributes(indent, null)
    }

    override fun isIncomplete(): Boolean = myIsIncomplete

    private val myIsIncomplete: Boolean by lazy {
        node.getChildren(null).any {
            it.elementType is PsiErrorElement
        }
                || FormatterUtil.isIncomplete(node)
    }

    private val mySubBlocks: List<Block> by lazy { buildChildren() }
}

data class VomlFormatterContext(
    val commonSettings: CommonCodeStyleSettings,
    val spacingBuilder: SpacingBuilder
) {
    companion object {
        fun create(settings: CodeStyleSettings): VomlFormatterContext {
            val commonSettings = settings.getCommonSettings(JssLanguage.INSTANCE)
            return VomlFormatterContext(commonSettings, createSpacingBuilder(commonSettings))
        }
    }
}

fun createSpacingBuilder(commonSettings: CommonCodeStyleSettings): SpacingBuilder =
    SpacingBuilder(commonSettings)
        // ,
        .after(JssTypes.COMMA).spacing(1, 1, 0, true, 0)
        .before(JssTypes.COMMA).spaceIf(false)
        // [ ]
        .after(JssTypes.BRACKET_L).spaceIf(false)
        .before(JssTypes.BRACKET_R).spaceIf(false)
        // { }
        .after(JssTypes.BRACE_L).spaceIf(false)
        .before(JssTypes.BRACE_R).spaceIf(false)
        // ( )
        .after(JssTypes.PARENTHESIS_L).spaceIf(false)
        .before(JssTypes.PARENTHESIS_R).spaceIf(false)

private fun Block.computeSpacing(child1: Block?, child2: Block, ctx: VomlFormatterContext): Spacing? {
    return ctx.spacingBuilder.getSpacing(this, child1, child2)
}

private fun ASTNode?.isWhitespaceOrEmpty() = this == null || textLength == 0 || elementType == TokenType.WHITE_SPACE

private fun JssAstBlock.computeIndent(child: ASTNode): Indent? {
    val isCornerChild = node.firstChildNode == child || node.lastChildNode == child
    return when (node.elementType) {
        JssTypes.TABLE -> when {
            isCornerChild || child.elementType == JssTypes.COMMA -> Indent.getNoneIndent()
            else -> Indent.getNormalIndent()
        }
        else -> Indent.getNoneIndent()
    }
}

private fun JssAstBlock.buildChildren(): List<Block> {
    return node.getChildren(null)
        .filter { !it.isWhitespaceOrEmpty() }
        .map { childNode ->
            JssFormattingModelBuilder.createBlock(
                node = childNode,
                alignment = null,
                indent = computeIndent(childNode),
                wrap = null,
                ctx
            )
        }
}
