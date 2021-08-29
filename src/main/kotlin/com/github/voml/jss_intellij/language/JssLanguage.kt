package com.github.voml.jss_intellij.language

import com.intellij.lang.Language
import com.github.voml.jss_intellij.ide.icons.VomlIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class JssLanguage private constructor() : Language("JSS") {
    companion object {
        @JvmStatic
        val INSTANCE = JssLanguage()
    }
}

class JssFileType private constructor() : LanguageFileType(JssLanguage.INSTANCE) {
    override fun getName(): String = JssBundle.message("filetype.name")

    override fun getDescription(): String = JssBundle.message("filetype.description")

    override fun getDefaultExtension(): String = "jss"

    override fun getIcon(): Icon = VomlIcons.FILE

    companion object {
        @JvmStatic
        val INSTANCE = JssFileType()
    }
}

class JssFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, JssLanguage.INSTANCE) {
    override fun getFileType(): FileType = JssFileType.INSTANCE

    override fun toString(): String = JssBundle.message("action.create_file")
}
