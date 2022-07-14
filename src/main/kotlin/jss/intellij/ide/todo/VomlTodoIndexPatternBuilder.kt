package jss.intellij.ide.todo

import jss.intellij.language.psi.JssLexerAdapter
import jss.intellij.language.file.JssFileNode
import jss.intellij.language.psi.JssParserDefinition
import com.intellij.lexer.Lexer
import com.intellij.psi.PsiFile
import com.intellij.psi.impl.search.IndexPatternBuilder
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet

class VomlTodoIndexPatternBuilder : IndexPatternBuilder {
    override fun getIndexingLexer(file: PsiFile): Lexer? {
        return if (file is JssFileNode) JssLexerAdapter() else null
    }

    override fun getCommentTokenSet(file: PsiFile): TokenSet? {
        return if (file is JssFileNode) JssParserDefinition.commentTokens else null
    }

    override fun getCommentStartDelta(tokenType: IElementType?): Int {
        return if (tokenType in JssParserDefinition.commentTokens) 2 else 0
    }

    override fun getCommentEndDelta(tokenType: IElementType?): Int = 0
}
