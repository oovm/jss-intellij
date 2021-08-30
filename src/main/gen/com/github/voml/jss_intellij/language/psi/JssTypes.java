// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.voml.jss_intellij.language.psi.impl.*;

public interface JssTypes {

  IElementType ANNOTATION = new JssElementType("ANNOTATION");
  IElementType ANNOTATION_MARK = new JssElementType("ANNOTATION_MARK");
  IElementType BACK_TOP = new JssElementType("BACK_TOP");
  IElementType ESCAPED = new JssElementType("ESCAPED");
  IElementType IDIOM_STATEMENT = new JssElementType("IDIOM_STATEMENT");
  IElementType INCLUDE_STATEMENT = new JssElementType("INCLUDE_STATEMENT");
  IElementType INSERT_DOT = new JssElementType("INSERT_DOT");
  IElementType INSERT_ITEM = new JssElementType("INSERT_ITEM");
  IElementType INSERT_PAIR = new JssElementType("INSERT_PAIR");
  IElementType INSERT_STAR = new JssElementType("INSERT_STAR");
  IElementType KEY_SYMBOL = new JssElementType("KEY_SYMBOL");
  IElementType NUMBER_SUFFIX = new JssElementType("NUMBER_SUFFIX");
  IElementType PAIR = new JssElementType("PAIR");
  IElementType PAIRED = new JssElementType("PAIRED");
  IElementType PREDEFINED_SYMBOL = new JssElementType("PREDEFINED_SYMBOL");
  IElementType PROPERTIES_BLOCK = new JssElementType("PROPERTIES_BLOCK");
  IElementType PROPERTIES_STATEMENT = new JssElementType("PROPERTIES_STATEMENT");
  IElementType REF = new JssElementType("REF");
  IElementType SCHEMA_STATEMENT = new JssElementType("SCHEMA_STATEMENT");
  IElementType SCOPE = new JssElementType("SCOPE");
  IElementType SCOPE_MARK = new JssElementType("SCOPE_MARK");
  IElementType SCOPE_SYMBOL = new JssElementType("SCOPE_SYMBOL");
  IElementType STRING_INLINE = new JssElementType("STRING_INLINE");
  IElementType STRING_MULTI = new JssElementType("STRING_MULTI");
  IElementType STRING_PREFIX = new JssElementType("STRING_PREFIX");
  IElementType SYMBOL_PATH = new JssElementType("SYMBOL_PATH");
  IElementType TABLE = new JssElementType("TABLE");
  IElementType TYPE_HINT = new JssElementType("TYPE_HINT");
  IElementType VALUE = new JssElementType("VALUE");

  IElementType ACCENT = new JssTokenType("^");
  IElementType ANGLE_L = new JssTokenType("<");
  IElementType ANGLE_R = new JssTokenType(">");
  IElementType AS = new JssTokenType("as");
  IElementType AT = new JssTokenType("@");
  IElementType BOOLEAN = new JssTokenType("BOOLEAN");
  IElementType BRACE_L = new JssTokenType("{");
  IElementType BRACE_R = new JssTokenType("}");
  IElementType BRACKET_L = new JssTokenType("[");
  IElementType BRACKET_R = new JssTokenType("]");
  IElementType BYTE = new JssTokenType("BYTE");
  IElementType CITE = new JssTokenType("CITE");
  IElementType COLON = new JssTokenType(":");
  IElementType COMMA = new JssTokenType(",");
  IElementType COMMENT = new JssTokenType("COMMENT");
  IElementType COMMENT_BLOCK = new JssTokenType("COMMENT_BLOCK");
  IElementType COMMENT_DOCUMENT = new JssTokenType("COMMENT_DOCUMENT");
  IElementType DECIMAL = new JssTokenType("DECIMAL");
  IElementType DOLLAR = new JssTokenType("DOLLAR");
  IElementType DOT = new JssTokenType(".");
  IElementType EQ = new JssTokenType("=");
  IElementType ESCAPE = new JssTokenType("\\");
  IElementType IMPORT = new JssTokenType("@import");
  IElementType INCLUDE = new JssTokenType("@include");
  IElementType INHERIT = new JssTokenType("@inherit");
  IElementType INTEGER = new JssTokenType("INTEGER");
  IElementType NAN = new JssTokenType("nan");
  IElementType NON_ESCAPE = new JssTokenType("NON_ESCAPE");
  IElementType NULL = new JssTokenType("null");
  IElementType PARENTHESIS_L = new JssTokenType("(");
  IElementType PARENTHESIS_R = new JssTokenType(")");
  IElementType PROP = new JssTokenType("properties");
  IElementType QUOTATION = new JssTokenType("\"");
  IElementType SCHEMA = new JssTokenType("schema");
  IElementType SEMICOLON = new JssTokenType(";");
  IElementType SIGN = new JssTokenType("SIGN");
  IElementType STAR = new JssTokenType("*");
  IElementType STRING = new JssTokenType("STRING");
  IElementType SYMBOL = new JssTokenType("SYMBOL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANNOTATION) {
        return new JssAnnotationImpl(node);
      }
      else if (type == ANNOTATION_MARK) {
        return new JssAnnotationMarkImpl(node);
      }
      else if (type == BACK_TOP) {
        return new JssBackTopImpl(node);
      }
      else if (type == ESCAPED) {
        return new JssEscapedImpl(node);
      }
      else if (type == IDIOM_STATEMENT) {
        return new JssIdiomStatementImpl(node);
      }
      else if (type == INCLUDE_STATEMENT) {
        return new JssIncludeStatementImpl(node);
      }
      else if (type == INSERT_DOT) {
        return new JssInsertDotImpl(node);
      }
      else if (type == INSERT_ITEM) {
        return new JssInsertItemImpl(node);
      }
      else if (type == INSERT_PAIR) {
        return new JssInsertPairImpl(node);
      }
      else if (type == INSERT_STAR) {
        return new JssInsertStarImpl(node);
      }
      else if (type == KEY_SYMBOL) {
        return new JssKeySymbolImpl(node);
      }
      else if (type == NUMBER_SUFFIX) {
        return new JssNumberSuffixImpl(node);
      }
      else if (type == PAIR) {
        return new JssPairImpl(node);
      }
      else if (type == PAIRED) {
        return new JssPairedImpl(node);
      }
      else if (type == PREDEFINED_SYMBOL) {
        return new JssPredefinedSymbolImpl(node);
      }
      else if (type == PROPERTIES_BLOCK) {
        return new JssPropertiesBlockImpl(node);
      }
      else if (type == PROPERTIES_STATEMENT) {
        return new JssPropertiesStatementImpl(node);
      }
      else if (type == REF) {
        return new JssRefImpl(node);
      }
      else if (type == SCHEMA_STATEMENT) {
        return new JssSchemaStatementImpl(node);
      }
      else if (type == SCOPE) {
        return new JssScopeImpl(node);
      }
      else if (type == SCOPE_MARK) {
        return new JssScopeMarkImpl(node);
      }
      else if (type == SCOPE_SYMBOL) {
        return new JssScopeSymbolImpl(node);
      }
      else if (type == STRING_INLINE) {
        return new JssStringInlineImpl(node);
      }
      else if (type == STRING_MULTI) {
        return new JssStringMultiImpl(node);
      }
      else if (type == STRING_PREFIX) {
        return new JssStringPrefixImpl(node);
      }
      else if (type == SYMBOL_PATH) {
        return new JssSymbolPathImpl(node);
      }
      else if (type == TABLE) {
        return new JssTableImpl(node);
      }
      else if (type == TYPE_HINT) {
        return new JssTypeHintImpl(node);
      }
      else if (type == VALUE) {
        return new JssValueImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
