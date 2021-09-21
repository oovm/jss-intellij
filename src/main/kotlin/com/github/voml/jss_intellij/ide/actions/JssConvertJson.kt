package com.github.voml.jss_intellij.ide.actions

import com.github.voml.jss_intellij.JssBundle
import com.github.voml.jss_intellij.ide.file_view.JssFileType
import com.github.voml.jss_intellij.ide.file_view.JssIcons
import com.intellij.ide.actions.CreateFileAction
import com.intellij.json.psi.JsonFile
import com.intellij.json.psi.JsonObject
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.LangDataKeys
import com.intellij.openapi.fileEditor.FileDocumentManager
import com.intellij.openapi.project.DumbAwareAction
import com.intellij.psi.*



class JssConvertJson : DumbAwareAction(name, description, JssIcons.FILE) {
    companion object {
        private val name = JssBundle.message("action.convert_json")
        private val description = JssBundle.message("action.convert_json.description")

        fun tryGetJsonSchema(file: PsiFile): JsonObject? {
            if (file is JsonFile) {
                when (val root = file.topLevelValue) {
                    is JsonObject -> {
                        if (root.findProperty("\$schema") != null) {
                            return root
                        }
                    }
                }
            }
            return null
        }
    }

    override fun update(event: AnActionEvent) {
        super.update(event)
//        if (ActionPlaces.isPopupPlace(event.place)) {
//            val presentation = event.presentation
//            presentation.isVisible = presentation.isEnabled
//        }
    }


    override fun actionPerformed(e: AnActionEvent) {
        val file = LangDataKeys.PSI_FILE.getData(e.dataContext)
        val document = file?.let { tryGetJsonSchema(it) } ?: return;
        val buffer = StringBuilder()
        buffer.append(
            """${document.propertyList}
"""
        )

        var name: String = file.name;
        if (name.endsWith(".json")) {
            name = name.substring(0, file.name.length - 5)
        }
        name = "$name.jss"
        val fileVirtual =
            PsiFileFactory.getInstance(file.project).createFileFromText(name, JssFileType.INSTANCE, buffer)
        val doc = PsiDocumentManager.getInstance(fileVirtual.project).getDocument(fileVirtual)!!
        FileDocumentManager.getInstance().saveDocument(doc)

    }
}

