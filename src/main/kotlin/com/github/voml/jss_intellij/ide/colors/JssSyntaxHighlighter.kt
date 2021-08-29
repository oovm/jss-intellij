package com.github.voml.jss_intellij.ide.colors

import com.github.voml.jss_intellij.language.JssLexerAdapter
import com.github.voml.jss_intellij.language.psi.JssTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class JssSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return JssLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): JssColor? {
        return when (tokenType) {
            //
            JssTypes.INCLUDE, JssTypes.INHERIT, JssTypes.AS -> JssColor.KEYWORD
            JssTypes.ANNOTATION, JssTypes.ANNOTATION_MARK -> JssColor.ANNOTATION
            JssTypes.PREDEFINED_SYMBOL -> JssColor.PREDEFINED
            //
            JssTypes.STRING_PREFIX -> JssColor.STRING_HINT
            JssTypes.NUMBER_SUFFIX -> JssColor.NUMBER_HINT
            JssTypes.TYPE_HINT -> JssColor.TYPE_HINT
            JssTypes.SCOPE_SYMBOL -> JssColor.SCOPE_SYMBOL
            JssTypes.SCOPE_MARK -> JssColor.SCOPE_MARK
            JssTypes.INSERT_DOT, JssTypes.INSERT_STAR -> JssColor.INSERT_MARK
            //
            JssTypes.PARENTHESIS_L, JssTypes.PARENTHESIS_R -> JssColor.PARENTHESES
            JssTypes.BRACKET_L, JssTypes.BRACKET_R -> JssColor.BRACKETS
            JssTypes.BRACE_L, JssTypes.BRACE_R -> JssColor.BRACES
            JssTypes.COLON, JssTypes.EQ -> JssColor.SET
            JssTypes.COMMA -> JssColor.COMMA
            // atom
            JssTypes.NULL -> JssColor.NULL
            JssTypes.BOOLEAN -> JssColor.BOOLEAN

            JssTypes.NUMBER_SUFFIX -> JssColor.NUMBER_HINT
            JssTypes.INTEGER -> JssColor.INTEGER
            JssTypes.DECIMAL -> JssColor.DECIMAL

            JssTypes.STRING_PREFIX -> JssColor.STRING_HINT
            JssTypes.STRING_INLINE -> JssColor.STRING
            JssTypes.STRING_MULTI -> JssColor.STRING

            JssTypes.SYMBOL -> JssColor.IDENTIFIER
            // 注释
            JssTypes.COMMENT -> JssColor.LINE_COMMENT
            JssTypes.BLOCK_COMMENT -> JssColor.BLOCK_COMMENT
            // 错误
            TokenType.BAD_CHARACTER -> JssColor.BAD_CHARACTER
            else -> null
        }
    }
}
