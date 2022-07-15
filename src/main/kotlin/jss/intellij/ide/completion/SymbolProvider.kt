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
        addProperty(resultSet)
    }

    private fun addProperty(resultSet: CompletionResultSet) {
        resultSet.addProperty("minItems", "number")
        resultSet.addProperty("maxItems", "number")
        resultSet.addProperty("minimum", "number")
        resultSet.addProperty("exclusiveMinimum", "boolean")
        resultSet.addProperty("maximum", "number")
        resultSet.addProperty("exclusiveMaximum", "boolean")
        resultSet.addProperty("items", "array")
    }
}

private fun CompletionResultSet.addProperty(field: String, typing: String) {
    val e = LookupElementBuilder.create(field)
        .withPresentableText(field)
        .withIcon(JssIcons.PROPERTY)
        .withTypeText(typing)
        .withTailText(": ;")
        .withInsertHandler { ctx, _ ->
            EditorModificationUtil.moveCaretRelatively(ctx.editor, -1)
        }
    this.addElement(e)
}