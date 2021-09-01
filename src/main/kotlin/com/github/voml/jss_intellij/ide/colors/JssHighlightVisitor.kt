package com.github.voml.jss_intellij.ide.colors

import com.github.voml.jss_intellij.language.JssFile
import com.github.voml.jss_intellij.language.psi.*
import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile

class JssHighlightVisitor : JssVisitor(), HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null

    override fun visitIdiomMark(o: JssIdiomMark) {
        highlight(o, JssColor.IDIOM_MARK)
    }

    override fun visitIdiomSymbol(o: JssIdiomSymbol) {
        highlight(o, JssColor.ANNOTATION)
    }

//    override fun visitInsertItem(o: VomlInsertItem) {
//        for (symbol in o.children) {
//            val color = when (symbol) {
//                is VomlInsertDot -> VomlColor.INSERT_MARK
//                is VomlInsertStar -> VomlColor.INSERT_MARK
//                else -> null
//            }
//            if (color != null) {
//                highlight(symbol, color)
//            }
//        }
//        super.visitInsertItem(o)
//    }

    private fun highlight(element: PsiElement, color: JssColor) {
        val builder = HighlightInfo.newHighlightInfo(HighlightInfoType.INFORMATION)
        builder.textAttributes(color.textAttributesKey)
        builder.range(element)

        infoHolder?.add(builder.create())
    }

    override fun analyze(
        file: PsiFile,
        updateWholeFile: Boolean,
        holder: HighlightInfoHolder,
        action: Runnable
    ): Boolean {
        infoHolder = holder
        action.run()

        return true
    }

    override fun clone(): HighlightVisitor = JssHighlightVisitor()

    override fun suitableForFile(file: PsiFile): Boolean = file is JssFile

    override fun visit(element: PsiElement) = element.accept(this)
}