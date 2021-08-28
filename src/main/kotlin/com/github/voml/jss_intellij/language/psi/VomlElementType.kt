package com.github.voml.jss_intellij.language.psi

import com.github.voml.jss_intellij.language.VomlLanguage
import com.intellij.psi.tree.IElementType

class VomlElementType(debugName: String) : IElementType(debugName, VomlLanguage.INSTANCE)
