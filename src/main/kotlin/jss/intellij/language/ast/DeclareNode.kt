package jss.intellij.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import javax.swing.Icon

abstract class DeclareNode(node: ASTNode) : ASTWrapperPsiElement(node),
    PsiNameIdentifierOwner,
    ItemPresentation {

    abstract override fun getOriginalElement(): PsiElement;

    abstract override fun getNameIdentifier(): PsiElement;

    override fun getName(): String? {
        return nameIdentifier.text
    }

    abstract override fun setName(name: String): PsiElement;

    override fun getNavigationElement(): PsiElement {
        return nameIdentifier
    }

    override fun getTextOffset(): Int {
        return nameIdentifier.textOffset
    }

    override fun getPresentation(): ItemPresentation = this

    override fun getPresentableText(): String? {
        return this.name
    }

    final override fun getIcon(unused: Boolean): Icon {
        return this.getIcon(0)
    }

    abstract override fun getIcon(flags: Int): Icon;
}