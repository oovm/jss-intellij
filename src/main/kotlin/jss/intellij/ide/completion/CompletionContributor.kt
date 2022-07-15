package jss.intellij.ide.completion

import jss.intellij.language.psi.JssTypes
import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.patterns.CharPattern
import com.intellij.patterns.ElementPattern
import com.intellij.patterns.ElementPatternCondition
import com.intellij.patterns.PlatformPatterns
import com.intellij.patterns.StandardPatterns
import com.intellij.patterns.TreeElementPattern
import com.intellij.psi.PsiElement
import com.intellij.util.ProcessingContext

class CompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(JssTypes.SYMBOL),
            SymbolProvider()
        )
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(JssTypes.IDIOM_MARK),
            IdiomProvider()
        )
    }

    override fun beforeCompletion(context: CompletionInitializationContext) {
        super.beforeCompletion(context)
    }
}
