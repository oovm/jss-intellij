package com.github.voml.jss_intellij.ide.actions

import com.github.voml.jss_intellij.JssBundle
import com.github.voml.jss_intellij.ide.file_view.JssIcons
import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory

class JssConvertJson :
    CreateFileFromTemplateAction(NAME, JssBundle.message("action.convert_json.description"), JssIcons.FILE) {
    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder
            .setTitle(NAME)
            // See [resources/colors/fileTemplate]
            .addKind("Empty file", JssIcons.FILE, "Jss File")
    }

    override fun getActionName(directory: PsiDirectory, newName: String, templateName: String): String = NAME

    companion object {
        private val NAME = JssBundle.message("action.convert_json")
    }
}
