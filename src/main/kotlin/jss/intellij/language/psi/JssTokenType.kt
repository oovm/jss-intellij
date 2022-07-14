package jss.intellij.language.psi

import jss.intellij.language.JssLanguage
import com.intellij.psi.tree.IElementType

class JssTokenType(debugName: String) : IElementType(debugName, JssLanguage) {
    override fun toString(): String = "JssTokenType.${super.toString()}"
}

