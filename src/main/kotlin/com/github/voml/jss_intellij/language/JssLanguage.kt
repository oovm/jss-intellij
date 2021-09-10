package com.github.voml.jss_intellij.language

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.openapi.util.IconLoader
import com.intellij.ide.projectView.ProjectViewNestingRulesProvider
import com.intellij.ide.projectView.ProjectViewNestingRulesProvider.*
import org.jetbrains.annotations.NotNull

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

    override fun getIcon(): Icon = JssIcons.FILE

    companion object {
        @JvmStatic
        val INSTANCE = JssFileType()
    }
}

class JssFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, JssLanguage.INSTANCE) {
    override fun getFileType(): FileType = JssFileType.INSTANCE

    override fun toString(): String = JssBundle.message("action.create_file")
}


object JssIcons {
    val FILE = IconLoader.getIcon("/icons/jssIcon.svg", JssIcons::class.java)
}

/**
 * Nests jss files created using introspection under their target JSON files.
 */
class JssFileGroup : ProjectViewNestingRulesProvider {
    override fun addFileNestingRules(@NotNull consumer: Consumer) {
        consumer.addNestingRule(".jss", ".json")
        consumer.addNestingRule(".jss", ".json5")
        consumer.addNestingRule(".jss", ".yaml")
        consumer.addNestingRule(".jss", ".toml")
    }

}