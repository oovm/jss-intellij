package jss.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import jss.intellij.ide.file_view.JssIcons
import jss.intellij.language.ast.DeclareNode
import jss.intellij.language.psi_node.JssSchemaStatementNode
import javax.swing.Icon

open class MixinSchema(node: ASTNode) : DeclareNode(node) {

    override fun getOriginalElement(): JssSchemaStatementNode {
        return this as JssSchemaStatementNode
    }
    override fun getNameIdentifier(): PsiElement {
       return originalElement.symbol
    }
    override fun getIcon(flags: Int): Icon = JssIcons.SCHEMA
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }
}


