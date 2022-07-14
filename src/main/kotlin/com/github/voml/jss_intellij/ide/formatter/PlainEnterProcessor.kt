package com.github.voml.jss_intellij.ide.formatter

import com.github.voml.jss_intellij.ide.file_view.JssFile
import com.intellij.lang.SmartEnterProcessorWithFixers
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile

class PlainEnterProcessor : SmartEnterProcessorWithFixers.FixEnterProcessor() {
    override fun doEnter(atCaret: PsiElement, file: PsiFile, editor: Editor, modified: Boolean): Boolean {
        if (file !is JssFile) return false
        plainEnter(editor)
        return true
    }
}