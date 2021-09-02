package com.github.voml.jss_intellij.ide.colors

import com.github.voml.jss_intellij.language.JssFile
import com.github.voml.jss_intellij.language.psi.*
import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.util.elementType

class JssHighlightVisitor : JssVisitor(), HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null

    override fun visitSchemaStatement(o: JssSchemaStatement) {
        highlight(o.firstChild, JssColor.KEYWORD)
        super.visitSchemaStatement(o)
    }


    override fun visitPropertiesStatement(o: JssPropertiesStatement) {
        val head = o.firstChild;
        if (head.elementType == JssTypes.SYMBOL) {
            highlight(head, JssColor.KEYWORD)
        }

        super.visitPropertiesStatement(o)
    }

    override fun visitIdiomMark(o: JssIdiomMark) {
        highlight(o, JssColor.IDIOM_MARK)
    }

    override fun visitIdiomSymbol(o: JssIdiomSymbol) {
        highlight(o, JssColor.ANNOTATION)
    }


    override fun visitAnnoStatement(o: JssAnnoStatement) {
        super.visitAnnoStatement(o)
    }


    override fun visitValue(o: JssValue) {
        val head = o.firstChild;
        when (head.elementType) {
            JssTypes.SYMBOL -> {
                when (head.toString()) {
                    "null" -> highlight(head, JssColor.NULL)
                    "true" -> highlight(head, JssColor.BOOLEAN)
                    "false" -> highlight(head, JssColor.BOOLEAN)
                }
            }
        }
        super.visitValue(o)
    }


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