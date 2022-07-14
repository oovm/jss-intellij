package jss.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import jss.intellij.ide.view.JssViewElement
import jss.intellij.language.file.JssIcons
import jss.intellij.language.psi.searchChildrenOfType
import jss.intellij.language.psi_node.JssBooleanNode
import javax.swing.Icon

open class MixinArray(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getOriginalElement(): JssBooleanNode {
        return this as JssBooleanNode
    }
    override fun getIcon(flags: Int): Icon = JssIcons.ANNOTATION

    fun getChildrenView(): Array<JssViewElement> {
        return this.searchChildrenOfType(NavigatablePsiElement::class.java)
            .map { JssViewElement(it) }
            .toTypedArray()
    }
}