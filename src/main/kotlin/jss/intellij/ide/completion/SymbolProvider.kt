package jss.intellij.ide.completion

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.editor.EditorModificationUtil
import com.intellij.util.ProcessingContext
import jss.intellij.language.file.JssIcons

class SymbolProvider : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext, resultSet: CompletionResultSet) {
        print(parameters)
        print(context)

        addProperty(resultSet)
    }


    private fun addProperty(set: CompletionResultSet) {
        set.addKeyword("property", "keyword")
        set.addKeyword("schema", "keyword")
        set.addProperty("type", "string | array")
        addArrayProperty(set)
        addObjectProperty(set)
    }

    private fun addArrayProperty(set: CompletionResultSet) {
        set.addProperty("minItems", "number")
        set.addProperty("maxItems", "number")
        set.addProperty("minimum", "number")
        set.addProperty("exclusiveMinimum", "boolean")
        set.addProperty("maximum", "number")
        set.addProperty("exclusiveMaximum", "boolean")
        set.addProperty("items", "object")
    }

    private fun addObjectProperty(set: CompletionResultSet) {
        set.addProperty("minProperties", "number")
        set.addProperty("maxProperties", "number")
        set.addProperty("required", "array")
        set.addProperty("properties", "object")
        set.addProperty("additionalProperties", "object")
    }
}

private fun CompletionResultSet.addProperty(field: String, typing: String) {
    val e = when (typing) {
        "array" -> LookupElementBuilder.create("$field: [];").withInsertHandler { ctx, _ ->
            EditorModificationUtil.moveCaretRelatively(ctx.editor, -2)
        }
        "object" -> LookupElementBuilder.create("$field: {};").withInsertHandler { ctx, _ ->
            EditorModificationUtil.moveCaretRelatively(ctx.editor, -2)
        }
        "string" -> LookupElementBuilder.create("$field: '';").withInsertHandler { ctx, _ ->
            EditorModificationUtil.moveCaretRelatively(ctx.editor, -2)
        }
        else -> {
            LookupElementBuilder.create("$field: ;").withInsertHandler { ctx, _ ->
                EditorModificationUtil.moveCaretRelatively(ctx.editor, -1)
            }
        }
    }
    val e2 = e.withPresentableText(field)
        .withIcon(JssIcons.PROPERTY)
        .withTypeText(typing)
    this.addElement(e2)
}

private fun CompletionResultSet.addKeyword(keyword: String, typing: String) {
    val e = LookupElementBuilder.create(keyword)
        .withPresentableText(keyword)
        .withIcon(JssIcons.SCHEMA)
        .withTypeText(typing)
        .withBoldness(true)
        .withInsertHandler { ctx, _ ->
            EditorModificationUtil.moveCaretRelatively(ctx.editor, -1)
        }
    this.addElement(e)
}