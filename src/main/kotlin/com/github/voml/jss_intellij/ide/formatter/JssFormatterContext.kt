package com.github.voml.jss_intellij.ide.formatter

import com.github.voml.jss_intellij.language.JssLanguage
import com.intellij.formatting.SpacingBuilder
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CommonCodeStyleSettings

data class JssFormatterContext(
    val commonSettings: CommonCodeStyleSettings,
    val spacingBuilder: SpacingBuilder
) {
    companion object {
        fun create(settings: CodeStyleSettings): JssFormatterContext {
            val commonSettings = settings.getCommonSettings(JssLanguage.INSTANCE)
            return JssFormatterContext(commonSettings, createSpacingBuilder(commonSettings))
        }
    }
}