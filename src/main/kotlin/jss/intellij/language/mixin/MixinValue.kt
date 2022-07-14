package jss.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import jss.intellij.language.file.JssIcons
import jss.intellij.language.psi_node.JssValueNode
import javax.swing.Icon

open class MixinValue(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getOriginalElement(): JssValueNode {
        return this as JssValueNode
    }
    override fun getIcon(flags: Int): Icon = JssIcons.ANNOTATION
}

