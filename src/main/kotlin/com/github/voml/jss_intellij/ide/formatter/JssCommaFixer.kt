package com.github.voml.jss_intellij.ide.formatter


import com.intellij.lang.SmartEnterProcessorWithFixers
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiErrorElement
import com.intellij.psi.PsiFile
import com.intellij.psi.impl.source.tree.LeafPsiElement

class JssCommaFixer : SmartEnterProcessorWithFixers.Fixer<JssSmartEnter>() {
    override fun apply(editor: Editor, processor: JssSmartEnter, element: PsiElement) {

    }
}
