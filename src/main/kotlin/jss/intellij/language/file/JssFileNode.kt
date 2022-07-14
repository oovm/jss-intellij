package jss.intellij.language.file

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.util.PsiTreeUtil
import jss.intellij.ide.view.JssViewElement
import jss.intellij.language.JssLanguage
import jss.intellij.language.psi.searchChildrenOfType

class JssFileNode(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, JssLanguage) {
    override fun getFileType(): FileType = JssFileType

    override fun toString(): String = JssBundle.message("filetype.description")
    
    fun getChildrenView(): Array<JssViewElement> {
        return this.searchChildrenOfType(NavigatablePsiElement::class.java)
            .map { JssViewElement(it) }
            .toTypedArray()
    }
}