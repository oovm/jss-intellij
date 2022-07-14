package com.github.voml.jss_intellij.language.mixin

import com.intellij.extapi.psi.ASTDelegatePsiElement
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.PsiReference
import com.intellij.psi.impl.source.tree.SharedImplUtil

abstract class JssPropertiesKeyMixin(node: ASTNode) : ASTDelegatePsiElement(),
    PsiReference, PsiNameIdentifierOwner {
    private var myNode: ASTNode = node

    override fun getParent(): PsiElement {
        return SharedImplUtil.getParent(node)
    }

    override fun getNode(): ASTNode {
        return myNode
    }
//
//    override fun setName(name: String): PsiElement {
//        val keyNode: ASTNode = element.node.findChildByType(SimpleTypes.KEY)
//        if (keyNode != null) {
//            val property: SimpleProperty = SimpleElementFactory.createProperty(element.project, newName)
//            val newKeyNode: ASTNode = property.getFirstChild().getNode()
//            element.node.replaceChild(keyNode, newKeyNode)
//        }
//        return element
//    }

//    override fun getNameIdentifier(): PsiElement? {
//        val keyNode: ASTNode = element.node.findChildByType(SimpleTypes.KEY)
//        return if (keyNode != null) {
//            keyNode.psi
//        } else {
//            null
//        }
//    }

    override fun getElement(): PsiElement {
        return myNode.psi
    }

    override fun getRangeInElement(): TextRange {
        return myNode.textRange
    }

    override fun resolve(): PsiElement? {
        TODO("Not yet implemented")
    }

    override fun getCanonicalText(): String {
        TODO("Not yet implemented")
    }

    override fun handleElementRename(newElementName: String): PsiElement {

        TODO("Not yet implemented")
    }

    override fun bindToElement(element: PsiElement): PsiElement {
        TODO("Not yet implemented")
    }

    override fun isReferenceTo(element: PsiElement): Boolean {
        return true
    }

    override fun isSoft(): Boolean {
        return false
    }
}