package com.github.voml.jss_intellij.ide

import com.github.voml.jss_intellij.ide.colors.VomlColor
import com.github.voml.jss_intellij.language.VomlLexerAdapter
import com.github.voml.jss_intellij.language.psi.JssTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class VomlSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return VomlLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): VomlColor? {
        return when (tokenType) {
            //
            JssTypes.INCLUDE, JssTypes.INHERIT, JssTypes.AS -> VomlColor.KEYWORD
            JssTypes.ANNOTATION, JssTypes.ANNOTATION_MARK -> VomlColor.ANNOTATION
            JssTypes.PREDEFINED_SYMBOL -> VomlColor.PREDEFINED
            //
            JssTypes.STRING_PREFIX -> VomlColor.STRING_HINT
            JssTypes.NUMBER_SUFFIX -> VomlColor.NUMBER_HINT
            JssTypes.TYPE_HINT -> VomlColor.TYPE_HINT
            JssTypes.SCOPE_SYMBOL -> VomlColor.SCOPE_SYMBOL
            JssTypes.SCOPE_MARK -> VomlColor.SCOPE_MARK
            JssTypes.INSERT_DOT, JssTypes.INSERT_STAR -> VomlColor.INSERT_MARK
            //
            JssTypes.PARENTHESIS_L, JssTypes.PARENTHESIS_R -> VomlColor.PARENTHESES
            JssTypes.BRACKET_L, JssTypes.BRACKET_R -> VomlColor.BRACKETS
            JssTypes.BRACE_L, JssTypes.BRACE_R -> VomlColor.BRACES
            JssTypes.COLON, JssTypes.EQ -> VomlColor.SET
            JssTypes.COMMA -> VomlColor.COMMA
            // atom
            JssTypes.NULL -> VomlColor.NULL
            JssTypes.BOOLEAN -> VomlColor.BOOLEAN

            JssTypes.NUMBER_SUFFIX -> VomlColor.NUMBER_HINT
            JssTypes.INTEGER -> VomlColor.INTEGER
            JssTypes.DECIMAL -> VomlColor.DECIMAL

            JssTypes.STRING_PREFIX -> VomlColor.STRING_HINT
            JssTypes.STRING_INLINE -> VomlColor.STRING
            JssTypes.STRING_MULTI -> VomlColor.STRING

            JssTypes.SYMBOL -> VomlColor.IDENTIFIER
            // 注释
            JssTypes.COMMENT -> VomlColor.LINE_COMMENT
            JssTypes.BLOCK_COMMENT -> VomlColor.BLOCK_COMMENT
            // 错误
            TokenType.BAD_CHARACTER -> VomlColor.BAD_CHARACTER
            else -> null
        }
    }
}
