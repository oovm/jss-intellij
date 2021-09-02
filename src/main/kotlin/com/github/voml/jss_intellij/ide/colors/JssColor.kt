package com.github.voml.jss_intellij.ide.colors

import com.github.voml.jss_intellij.language.JssBundle
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.OptionsBundle
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.util.NlsContexts
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Default
import java.util.function.Supplier


// TODO: 分类
enum class JssColor(humanName: Supplier<@NlsContexts.AttributeDescriptor String>, default: TextAttributesKey? = null) {
    // 特殊关键词
    KEYWORD(OptionsBundle.messagePointer("options.language.defaults.keyword"), Default.KEYWORD),
    ANNOTATION(OptionsBundle.messagePointer("options.java.attribute.descriptor.annotation.name"), Default.METADATA),
    IDIOM_MARK(JssBundle.messagePointer("color.token.idiom_mark"), ANNOTATION.textAttributesKey),
    PROP_MARK(JssBundle.messagePointer("color.token.properties_mark"), KEYWORD.textAttributesKey),
    // 字面量
    NULL(JssBundle.messagePointer("color.token.null"), Default.KEYWORD),
    BOOLEAN(JssBundle.messagePointer("color.token.boolean"), Default.KEYWORD),
    DECIMAL(JssBundle.messagePointer("color.token.decimal"), Default.NUMBER),
    INTEGER(JssBundle.messagePointer("color.token.integer"), Default.NUMBER),
    STRING(JssBundle.messagePointer("color.token.string"), Default.STRING),
    URL(JssBundle.messagePointer("color.token.url"), STRING.textAttributesKey),
    // 标识符
    IDENTIFIER(OptionsBundle.messagePointer("options.language.defaults.identifier"), Default.IDENTIFIER),
    KEY_SYMBOL(JssBundle.messagePointer("color.settings.voml.key_symbol"), Default.STATIC_FIELD),
    SCOPE_SYMBOL(JssBundle.messagePointer("color.settings.voml.scope_symbol"), Default.STATIC_METHOD),
    //
    TYPE_HINT(JssBundle.messagePointer("color.settings.toml.type_hint"), Default.CLASS_NAME),
    PREDEFINED(OptionsBundle.messagePointer("options.language.defaults.predefined"), Default.PREDEFINED_SYMBOL),
    // 标点符号
    PARENTHESES(OptionsBundle.messagePointer("options.language.defaults.parentheses"), Default.PARENTHESES),
    BRACKETS(OptionsBundle.messagePointer("options.language.defaults.brackets"), Default.BRACKETS),
    BRACES(OptionsBundle.messagePointer("options.language.defaults.braces"), Default.BRACES),
    DOT(OptionsBundle.messagePointer("options.language.defaults.dot"), Default.DOT),
    COMMA(OptionsBundle.messagePointer("options.language.defaults.comma"), Default.COMMA),
    SET(JssBundle.messagePointer("color.settings.voml.set"), Default.OPERATION_SIGN),
    SEMICOLON(OptionsBundle.messagePointer("options.language.defaults.semicolon"), Default.SEMICOLON),
    // 注释
    LINE_COMMENT(OptionsBundle.messagePointer("options.language.defaults.line.comment"), Default.LINE_COMMENT),
    BLOCK_COMMENT(OptionsBundle.messagePointer("options.language.defaults.block.comment"), Default.BLOCK_COMMENT),
    DOC_COMMENT(OptionsBundle.messagePointer("options.language.defaults.doc.markup"), Default.DOC_COMMENT),
    // 错误
    BAD_CHARACTER(OptionsBundle.messagePointer("options.java.attribute.descriptor.bad.character"), HighlighterColors.BAD_CHARACTER),
    // 废弃
    EXTENSION(OptionsBundle.messagePointer("options.language.defaults.metadata"), Default.METADATA),
    ;

    val textAttributesKey: TextAttributesKey = TextAttributesKey.createTextAttributesKey("voml.lang.$name", default)
    val attributesDescriptor: AttributesDescriptor = AttributesDescriptor(humanName, textAttributesKey)
    val testSeverity: HighlightSeverity = HighlightSeverity(name, HighlightSeverity.INFORMATION.myVal)
}
