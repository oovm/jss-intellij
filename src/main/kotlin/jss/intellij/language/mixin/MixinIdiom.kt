package jss.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import jss.intellij.ide.file_view.JssIcons
import jss.intellij.language.ast.DeclareNode
import jss.intellij.language.psi_node.JssIdiomStatementNode
import jss.intellij.language.psi_node.JssSchemaStatementNode
import javax.swing.Icon

/// 惯用法
/// `${idiom.name}`
open class MixinIdiom(node: ASTNode) : DeclareNode(node) {

    override fun getOriginalElement(): JssIdiomStatementNode {
        return this as JssIdiomStatementNode
    }
    override fun getNameIdentifier(): PsiElement {
       return originalElement.identifier
    }
    override fun getIcon(flags: Int): Icon = JssIcons.IDIOM
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }
}


