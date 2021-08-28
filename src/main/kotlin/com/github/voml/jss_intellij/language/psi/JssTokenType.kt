package com.github.voml.jss_intellij.language.psi

import com.github.voml.jss_intellij.language.JssLanguage
import com.intellij.psi.tree.IElementType

class JssTokenType(debugName: String) : IElementType(debugName, JssLanguage.INSTANCE) {
    override fun toString(): String = "JssTokenType.${super.toString()}"
}


