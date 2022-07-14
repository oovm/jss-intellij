package jss.intellij.language.psi

import jss.intellij.ide.file_view.JssFile
import jss.intellij.language.JssLanguage
import jss.intellij.language.parser.JssParser
import jss.intellij.language.psi.JssTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet


object JssParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer = JssLexerAdapter()

    override fun createParser(project: Project): PsiParser = JssParser()

    override fun getFileNodeType(): IFileElementType = IFileElementType(JssLanguage)

    override fun getCommentTokens(): TokenSet = TokenSet.create(
        JssTypes.COMMENT,
        JssTypes.COMMENT_BLOCK,
        JssTypes.COMMENT_DOCUMENT
    )

    override fun getStringLiteralElements(): TokenSet = TokenSet.create(
        JssTypes.STRING_INLINE,
        JssTypes.STRING_MULTI
    )

    override fun createElement(node: ASTNode): PsiElement = JssTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = JssFile(viewProvider)

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }

}
