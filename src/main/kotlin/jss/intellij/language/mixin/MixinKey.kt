package jss.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.util.elementType
import jss.intellij.language.file.JssIcons
import jss.intellij.language.psi.JssTypes
import jss.intellij.language.psi_node.JssKeyNode
import javax.swing.Icon

open class MixinKey(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getOriginalElement(): JssKeyNode {
        return this as JssKeyNode
    }

    override fun getIcon(flags: Int): Icon = JssIcons.ANNOTATION

    override fun getName(): String = when (this.firstChild.elementType) {
        JssTypes.STRING -> text.substring(1, this.text.length - 1)
        else -> text
    }
}


