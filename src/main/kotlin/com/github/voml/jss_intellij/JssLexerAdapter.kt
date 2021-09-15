package com.github.voml.jss_intellij

import com.github.voml.jss_intellij.language._JssLexer
import com.intellij.lexer.FlexAdapter

class JssLexerAdapter : FlexAdapter(_JssLexer())