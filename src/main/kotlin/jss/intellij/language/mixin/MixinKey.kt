package jss.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner

open class MixinKey(node: ASTNode) : ASTWrapperPsiElement(node),
    PsiNameIdentifierOwner {
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
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement? {
        return null
    }

}