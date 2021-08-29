package com.github.voml.jss_intellij.ide.actions

import com.github.voml.jss_intellij.ide.icons.VomlIcons
import com.github.voml.jss_intellij.language.JssBundle
import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory

class JssCreateFile : CreateFileFromTemplateAction(NAME, JssBundle.message("action.create_file.description"), VomlIcons.FILE) {
    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder
            .setTitle(NAME)
            .addKind("Empty file", VomlIcons.FILE, JssBundle.message("action.create_file.template_name"))
    }

    override fun getActionName(directory: PsiDirectory, newName: String, templateName: String): String = NAME

    companion object {
        private val NAME = JssBundle.message("action.create_file")
    }
}
