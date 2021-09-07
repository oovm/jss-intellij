package com.github.voml.jss_intellij.ide.annotator.checkers

import com.github.voml.jss_intellij.language.psi.*
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.PsiElement


class JssStringChecker : CheckerAnnotator() {
    override fun check(element: PsiElement, holder: AnnotationHolder): CheckerAnnotatorResult = when {
        holder.isBatchMode -> CheckerAnnotatorResult.Ok
        else -> when (element) {
            is JssStringInline -> checkInline(element)
            is JssStringMulti -> checkMulti(element)
            else -> CheckerAnnotatorResult.Ok
        }
    }

    private fun checkInline(mapEntry: JssStringInline): CheckerAnnotatorResult {
        return CheckerAnnotatorResult.Ok
    }


    private fun checkMulti(mapEntry: JssStringMulti): CheckerAnnotatorResult {
//        val filteredEntries = (mapEntry.parent as VomlMap)
//            .mapEntryList
//            .asSequence()
//            .filterNot { it == mapEntry }
//
//        val duplicatesFound = filteredEntries.any { mapEntry.keyAsTextMatches(it.keyAsText) }
//
//        return if (duplicatesFound) {
//            CheckerAnnotatorResult.Error(
//                "Duplicate keys found in a dictionary",
//                mapEntry.mapKey.textRange
//            )
//        } else {
//            CheckerAnnotatorResult.Ok
//        }
        return CheckerAnnotatorResult.Ok
    }
}