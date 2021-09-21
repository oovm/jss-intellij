package com.github.voml.jss_intellij.ide.actions

import com.github.voml.jss_intellij.JssBundle
import com.intellij.codeInsight.CodeInsightActionHandler
import com.intellij.codeInsight.actions.BaseCodeInsightAction
import com.intellij.json.psi.JsonFile
import com.intellij.json.psi.JsonObject
import com.intellij.openapi.actionSystem.ActionPlaces
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFile


class JssConvertJson : BaseCodeInsightAction() {
    override fun update(event: AnActionEvent) {
        super.update(event)
//        if (ActionPlaces.isPopupPlace(event.place)) {
//            val presentation = event.presentation
//            presentation.isVisible = presentation.isEnabled
//        }
    }

    override fun isValidForFile(project: Project, editor: Editor, file: PsiFile): Boolean {
        return JssConvertJsonHandler.tryGetJsonSchema(file) != null
    }

    override fun getCommandName(): String {
        return "JssConvertJson"
    }

    override fun getTemplateText(): String? {
        return super.getTemplateText()
    }

    override fun getHandler(): CodeInsightActionHandler {
        return JssConvertJsonHandler()
    }

    companion object {
        private val NAME = JssBundle.message("action.convert_json")
    }
}

