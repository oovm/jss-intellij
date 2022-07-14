package jss.intellij.ide.formatter

import jss.intellij.language.file.JssFileNode
import com.intellij.lang.SmartEnterProcessorWithFixers
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile

class PlainEnterProcessor : SmartEnterProcessorWithFixers.FixEnterProcessor() {
    override fun doEnter(atCaret: PsiElement, file: PsiFile, editor: Editor, modified: Boolean): Boolean {
        if (file !is JssFileNode) return false
        plainEnter(editor)
        return true
    }
}