package com.github.voml.jss_intellij.language

import com.intellij.lang.Language

class JssLanguage private constructor() : Language("JSS") {
    companion object {
        @JvmStatic
        val INSTANCE = JssLanguage()
    }
}


