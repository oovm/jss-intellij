// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.voml.jss_intellij.language.psi.impl.*;

public interface JssTypes {

  IElementType ANNO_STATEMENT = new JssElementType("ANNO_STATEMENT");
  IElementType ARRAY = new JssElementType("ARRAY");
  IElementType BOOLEAN = new JssElementType("BOOLEAN");
  IElementType BRACE_BLOCK = new JssElementType("BRACE_BLOCK");
  IElementType BRACKET_PAIR = new JssElementType("BRACKET_PAIR");
  IElementType DEF_STATEMENT = new JssElementType("DEF_STATEMENT");
  IElementType ESCAPED = new JssElementType("ESCAPED");
  IElementType IDIOM_MARK = new JssElementType("IDIOM_MARK");
  IElementType IDIOM_STATEMENT = new JssElementType("IDIOM_STATEMENT");
  IElementType IDIOM_SYMBOL = new JssElementType("IDIOM_SYMBOL");
  IElementType KEY_SYMBOL = new JssElementType("KEY_SYMBOL");
  IElementType NULL = new JssElementType("NULL");
  IElementType PAIR = new JssElementType("PAIR");
  IElementType PAIRED = new JssElementType("PAIRED");
  IElementType PROPERTIES_BLOCK = new JssElementType("PROPERTIES_BLOCK");
  IElementType PROPERTIES_LEY = new JssElementType("PROPERTIES_LEY");
  IElementType PROPERTIES_MARK = new JssElementType("PROPERTIES_MARK");
  IElementType PROPERTIES_STATEMENT = new JssElementType("PROPERTIES_STATEMENT");
  IElementType REF = new JssElementType("REF");
  IElementType SCHEMA_STATEMENT = new JssElementType("SCHEMA_STATEMENT");
  IElementType STRING_INLINE = new JssElementType("STRING_INLINE");
  IElementType STRING_MULTI = new JssElementType("STRING_MULTI");
  IElementType SYMBOL_PATH = new JssElementType("SYMBOL_PATH");
  IElementType TYPE_SYMBOL = new JssElementType("TYPE_SYMBOL");
  IElementType URL_MAYBE_VALID = new JssElementType("URL_MAYBE_VALID");
  IElementType VALUE = new JssElementType("VALUE");

  IElementType ACCENT = new JssTokenType("^");
  IElementType ANGLE_L = new JssTokenType("<");
  IElementType ANGLE_R = new JssTokenType(">");
  IElementType AS = new JssTokenType("AS");
  IElementType AT = new JssTokenType("@");
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
  IElementType DEFINE = new JssTokenType("DEFINE");
  IElementType DOLLAR = new JssTokenType("$");
  IElementType DOT = new JssTokenType(".");
  IElementType EQ = new JssTokenType("=");
  IElementType ESCAPE = new JssTokenType("\\");
  IElementType INTEGER = new JssTokenType("INTEGER");
  IElementType NAN = new JssTokenType("nan");
  IElementType NON_ESCAPE = new JssTokenType("NON_ESCAPE");
  IElementType PARENTHESIS_L = new JssTokenType("(");
  IElementType PARENTHESIS_R = new JssTokenType(")");
  IElementType QUOTATION = new JssTokenType("\"");
  IElementType SEMICOLON = new JssTokenType(";");
  IElementType SIGN = new JssTokenType("SIGN");
  IElementType STAR = new JssTokenType("*");
  IElementType STRING = new JssTokenType("STRING");
  IElementType SYMBOL = new JssTokenType("SYMBOL");
  IElementType URL = new JssTokenType("URL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANNO_STATEMENT) {
        return new JssAnnoStatementImpl(node);
      }
      else if (type == ARRAY) {
        return new JssArrayImpl(node);
      }
      else if (type == BOOLEAN) {
        return new JssBooleanImpl(node);
      }
      else if (type == BRACE_BLOCK) {
        return new JssBraceBlockImpl(node);
      }
      else if (type == BRACKET_PAIR) {
        return new JssBracketPairImpl(node);
      }
      else if (type == DEF_STATEMENT) {
        return new JssDefStatementImpl(node);
      }
      else if (type == ESCAPED) {
        return new JssEscapedImpl(node);
      }
      else if (type == IDIOM_MARK) {
        return new JssIdiomMarkImpl(node);
      }
      else if (type == IDIOM_STATEMENT) {
        return new JssIdiomStatementImpl(node);
      }
      else if (type == IDIOM_SYMBOL) {
        return new JssIdiomSymbolImpl(node);
      }
      else if (type == KEY_SYMBOL) {
        return new JssKeySymbolImpl(node);
      }
      else if (type == NULL) {
        return new JssNullImpl(node);
      }
      else if (type == PAIR) {
        return new JssPairImpl(node);
      }
      else if (type == PAIRED) {
        return new JssPairedImpl(node);
      }
      else if (type == PROPERTIES_BLOCK) {
        return new JssPropertiesBlockImpl(node);
      }
      else if (type == PROPERTIES_LEY) {
        return new JssPropertiesLeyImpl(node);
      }
      else if (type == PROPERTIES_MARK) {
        return new JssPropertiesMarkImpl(node);
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
      else if (type == STRING_INLINE) {
        return new JssStringInlineImpl(node);
      }
      else if (type == STRING_MULTI) {
        return new JssStringMultiImpl(node);
      }
      else if (type == SYMBOL_PATH) {
        return new JssSymbolPathImpl(node);
      }
      else if (type == TYPE_SYMBOL) {
        return new JssTypeSymbolImpl(node);
      }
      else if (type == URL_MAYBE_VALID) {
        return new JssUrlMaybeValidImpl(node);
      }
      else if (type == VALUE) {
        return new JssValueImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
