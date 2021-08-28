package com.github.voml.jss_intellij.ide

import com.github.voml.jss_intellij.language.psi.VomlTypes
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler

class VomlQuoteHandler : SimpleTokenSetQuoteHandler(VomlTypes.STRING_INLINE)
