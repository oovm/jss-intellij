package com.github.voml.jss_intellij.ide.formatter

import com.github.voml.jss_intellij.language.JssLanguage
import com.github.voml.jss_intellij.language.psi.JssTypes
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

        private fun createSpacingBuilder(commonSettings: CommonCodeStyleSettings): SpacingBuilder {
            return SpacingBuilder(commonSettings)
                // ,
                .after(JssTypes.COMMA).spacing(1, 1, 0, true, 0)
                .before(JssTypes.COMMA).spaceIf(false)
                // [ ]
                .after(JssTypes.BRACKET_L).spaceIf(false)
                .before(JssTypes.BRACKET_R).spaceIf(false)
                // { }
                .after(JssTypes.BRACE_L).spaceIf(false)
                .before(JssTypes.BRACE_R).spaceIf(false)
                // ( )
                .after(JssTypes.PARENTHESIS_L).spaceIf(false)
                .before(JssTypes.PARENTHESIS_R).spaceIf(false)
        }
    }
}