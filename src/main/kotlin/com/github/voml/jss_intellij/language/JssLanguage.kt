package com.github.voml.jss_intellij.language

import com.intellij.lang.Language

object JssLanguage : Language("JSS") {
    override fun getDisplayName(): String {
        return super.getDisplayName()
    }
    override fun getMimeTypes(): Array<String> = arrayOf("text/x-jss")
}


