package jss.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import jss.intellij.ide.view.JssViewElement
import jss.intellij.language.file.JssIcons
import jss.intellij.language.ast.DeclareNode
import jss.intellij.language.psi.searchChildrenOfType
import jss.intellij.language.psi_node.JssIdentifierNode
import jss.intellij.language.psi_node.JssSchemaStatementNode
import javax.swing.Icon

open class MixinSchema(node: ASTNode) : DeclareNode(node) {
    override fun getOriginalElement(): JssSchemaStatementNode {
        return this as JssSchemaStatementNode
    }
    override fun getNameIdentifier(): JssIdentifierNode {
       return originalElement.identifier as JssIdentifierNode
    }
    override fun getIcon(flags: Int): Icon = JssIcons.SCHEMA
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }
    override fun getChildrenView(): Array<JssViewElement> {
        return originalElement.braceBlock
            .searchChildrenOfType(NavigatablePsiElement::class.java)
            .map { JssViewElement(it) }
            .toTypedArray()
    }
}


