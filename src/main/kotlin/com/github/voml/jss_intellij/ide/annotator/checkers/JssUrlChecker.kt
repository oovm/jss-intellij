package com.github.voml.jss_intellij.ide.annotator.checkers

import com.github.voml.jss_intellij.language.psi.*
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.PsiElement

class JssUrlChecker : CheckerAnnotator() {
    override fun check(element: PsiElement, holder: AnnotationHolder): CheckerAnnotatorResult =
        if (holder.isBatchMode) {
            CheckerAnnotatorResult.Ok
        } else {
            when (element) {
                is JssUrlMaybeValid -> checkUrl(element)
                else -> CheckerAnnotatorResult.Ok
            }
        }

    private fun checkUrl(objectEntry: JssUrlMaybeValid): CheckerAnnotatorResult {
//        val filteredEntries = (objectEntry.parent as VomlObjectBody)
//            .objectEntryList
//            .asSequence()
//            .filterNot { it == objectEntry }
//
//        val duplicatesFound = filteredEntries.any { it.keyTextMatches(objectEntry.keyText) }
//
//        return if (duplicatesFound) {
//            CheckerAnnotatorResult.Error(
//                "Duplicate keys found in an object",
//                objectEntry.namedField.ident.textRange
//            )
//        } else {
//            CheckerAnnotatorResult.Ok
//        }
        return CheckerAnnotatorResult.Ok
    }
}

