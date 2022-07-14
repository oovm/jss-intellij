package jss.intellij.language.psi

import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil


fun <T : PsiElement?> PsiElement?.searchChildrenOfType(vararg elements: Class<out T>, recursive: Boolean = false): Collection<T> {
    if (this == null) return emptyList()
    return when {
        recursive -> PsiTreeUtil.findChildrenOfAnyType(this, *elements)
        else -> PsiTreeUtil.getChildrenOfAnyType(this, *elements)
    }
}
