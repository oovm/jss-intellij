package jss.intellij.ide.file_view

import jss.intellij.language.JssBundle
import jss.intellij.language.JssLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class JssFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, JssLanguage) {
    override fun getFileType(): FileType = JssFileType.INSTANCE

    override fun toString(): String = JssBundle.message("action.create_file")
}