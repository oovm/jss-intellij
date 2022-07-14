package jss.intellij.ide.matcher

import jss.intellij.language.psi.JssTypes
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler

class JssQuoteHandler : SimpleTokenSetQuoteHandler(JssTypes.STRING_INLINE)
