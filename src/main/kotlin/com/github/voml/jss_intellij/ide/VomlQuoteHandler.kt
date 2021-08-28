package com.github.voml.jss_intellij.ide

import com.github.voml.jss_intellij.language.psi.JssTypes
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler

class VomlQuoteHandler : SimpleTokenSetQuoteHandler(JssTypes.STRING_INLINE)
