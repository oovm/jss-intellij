package com.github.voml.jss_intellij.ide.colors

import com.github.voml.jss_intellij.language.JssLexerAdapter
import com.github.voml.jss_intellij.language.psi.JssTypes
import com.github.voml.jss_intellij.language.psi.JssTypes.*
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
            INCLUDE, INHERIT, AS, SCHEMA -> JssColor.KEYWORD
            ANNOTATION, ANNOTATION_MARK -> JssColor.ANNOTATION
            PREDEFINED_SYMBOL -> JssColor.PREDEFINED
            //
            STRING_PREFIX -> JssColor.STRING_HINT
            NUMBER_SUFFIX -> JssColor.NUMBER_HINT
            TYPE_HINT -> JssColor.TYPE_HINT
            SCOPE_SYMBOL -> JssColor.SCOPE_SYMBOL
            SCOPE_MARK -> JssColor.SCOPE_MARK
            INSERT_DOT, INSERT_STAR -> JssColor.INSERT_MARK
            //
            PARENTHESIS_L, PARENTHESIS_R -> JssColor.PARENTHESES
            BRACKET_L, BRACKET_R -> JssColor.BRACKETS
            BRACE_L, BRACE_R -> JssColor.BRACES
            COLON, EQ -> JssColor.SET
            COMMA -> JssColor.COMMA
            // atom
            NULL -> JssColor.NULL
            BOOLEAN -> JssColor.BOOLEAN

            NUMBER_SUFFIX -> JssColor.NUMBER_HINT
            INTEGER -> JssColor.INTEGER
            DECIMAL -> JssColor.DECIMAL

            STRING_PREFIX -> JssColor.STRING_HINT
            STRING_INLINE -> JssColor.STRING
            STRING_MULTI -> JssColor.STRING

            SYMBOL -> JssColor.IDENTIFIER
            // 注释
            COMMENT -> JssColor.LINE_COMMENT
            BLOCK_COMMENT -> JssColor.BLOCK_COMMENT
            // 错误
            TokenType.BAD_CHARACTER -> JssColor.BAD_CHARACTER
            else -> null
        }
    }
}
