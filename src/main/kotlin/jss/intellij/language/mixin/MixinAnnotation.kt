package jss.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import jss.intellij.ide.view.JssViewElement
import jss.intellij.language.file.JssIcons
import jss.intellij.language.ast.DeclareNode
import jss.intellij.language.psi_node.JssAnnoStatementNode
import javax.swing.Icon

open class MixinAnnotation(node: ASTNode) : DeclareNode(node) {
    override fun getOriginalElement(): JssAnnoStatementNode {
        return this as JssAnnoStatementNode
    }
    override fun getNameIdentifier(): PsiElement {
        return originalElement.key
    }
    override fun getIcon(flags: Int): Icon = JssIcons.ANNOTATION
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getChildrenView(): Array<JssViewElement> {
//        return originalElement.blo
//            .searchChildrenOfType(NavigatablePsiElement::class.java)
//            .map { JssViewElement(it) }
//            .toTypedArray()
        return emptyArray()
    }
}


