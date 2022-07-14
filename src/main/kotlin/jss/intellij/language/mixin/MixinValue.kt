package jss.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import jss.intellij.ide.view.JssViewElement
import jss.intellij.language.file.JssIcons
import jss.intellij.language.psi.JssKey
import jss.intellij.language.psi.JssValue
import jss.intellij.language.psi_node.JssAnnoStatementNode
import jss.intellij.language.psi_node.JssKeyNode
import jss.intellij.language.psi_node.JssValueNode
import javax.swing.Icon

open class MixinValue(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getOriginalElement(): JssValueNode {
        return this as JssValueNode
    }
    override fun getIcon(flags: Int): Icon = JssIcons.ANNOTATION
}


