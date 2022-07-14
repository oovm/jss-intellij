// This is a generated file. Not intended for manual editing.
package jss.intellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import jss.intellij.language.psi_node.*;

public interface JssTypes {

  IElementType ANNO_STATEMENT = new JssElementType("ANNO_STATEMENT");
  IElementType ARRAY = new JssElementType("ARRAY");
  IElementType BOOLEAN = new JssElementType("BOOLEAN");
  IElementType BRACE_BLOCK = new JssElementType("BRACE_BLOCK");
  IElementType BRACKET_BLOCK = new JssElementType("BRACKET_BLOCK");
  IElementType DEF_STATEMENT = new JssElementType("DEF_STATEMENT");
  IElementType IDENTIFIER = new JssElementType("IDENTIFIER");
  IElementType IDIOM_MARK = new JssElementType("IDIOM_MARK");
  IElementType IDIOM_STATEMENT = new JssElementType("IDIOM_STATEMENT");
  IElementType KEY = new JssElementType("KEY");
  IElementType KV_PAIR = new JssElementType("KV_PAIR");
  IElementType NAMESPACE = new JssElementType("NAMESPACE");
  IElementType NULL = new JssElementType("NULL");
  IElementType OBJECT = new JssElementType("OBJECT");
  IElementType PROPERTIES_KEY = new JssElementType("PROPERTIES_KEY");
  IElementType PROPERTIES_STATEMENT = new JssElementType("PROPERTIES_STATEMENT");
  IElementType PROPERTY = new JssElementType("PROPERTY");
  IElementType PROPERTY_MARK = new JssElementType("PROPERTY_MARK");
  IElementType SCHEMA = new JssElementType("SCHEMA");
  IElementType SCHEMA_STATEMENT = new JssElementType("SCHEMA_STATEMENT");
  IElementType STRING_INLINE = new JssElementType("STRING_INLINE");
  IElementType STRING_MULTI = new JssElementType("STRING_MULTI");
  IElementType TYPE_HINT = new JssElementType("TYPE_HINT");
  IElementType URL_MAYBE_VALID = new JssElementType("URL_MAYBE_VALID");
  IElementType VALUE = new JssElementType("VALUE");

  IElementType ACCENT = new JssElementType("^");
  IElementType ANGLE_L = new JssElementType("<");
  IElementType ANGLE_R = new JssElementType(">");
  IElementType AT = new JssElementType("@");
  IElementType BRACE_L = new JssElementType("{");
  IElementType BRACE_R = new JssElementType("}");
  IElementType BRACKET_L = new JssElementType("[");
  IElementType BRACKET_R = new JssElementType("]");
  IElementType BYTE = new JssElementType("Byte");
  IElementType COLON = new JssElementType(":");
  IElementType COMMA = new JssElementType(",");
  IElementType COMMENT = new JssElementType("DocumentInline");
  IElementType COMMENT_BLOCK = new JssElementType("DocumentBlock");
  IElementType COMMENT_DOCUMENT = new JssElementType("DocumentComment");
  IElementType DECIMAL = new JssElementType("Decimal");
  IElementType DOLLAR = new JssElementType("$");
  IElementType DOT = new JssElementType(".");
  IElementType EQ = new JssElementType("=");
  IElementType INTEGER = new JssElementType("Integer");
  IElementType PARENTHESIS_L = new JssElementType("(");
  IElementType PARENTHESIS_R = new JssElementType(")");
  IElementType SEMICOLON = new JssElementType(";");
  IElementType SIGN = new JssElementType("SIGN");
  IElementType STAR = new JssElementType("*");
  IElementType STRING = new JssElementType("String");
  IElementType SYMBOL = new JssElementType("Symbol");
  IElementType URL = new JssElementType("Url");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANNO_STATEMENT) {
        return new JssAnnoStatementNode(node);
      }
      else if (type == ARRAY) {
        return new JssArrayNode(node);
      }
      else if (type == BOOLEAN) {
        return new JssBooleanNode(node);
      }
      else if (type == BRACE_BLOCK) {
        return new JssBraceBlockNode(node);
      }
      else if (type == BRACKET_BLOCK) {
        return new JssBracketBlockNode(node);
      }
      else if (type == DEF_STATEMENT) {
        return new JssDefStatementNode(node);
      }
      else if (type == IDENTIFIER) {
        return new JssIdentifierNode(node);
      }
      else if (type == IDIOM_MARK) {
        return new JssIdiomMarkNode(node);
      }
      else if (type == IDIOM_STATEMENT) {
        return new JssIdiomStatementNode(node);
      }
      else if (type == KEY) {
        return new JssKeyNode(node);
      }
      else if (type == KV_PAIR) {
        return new JssKvPairNode(node);
      }
      else if (type == NAMESPACE) {
        return new JssNamespaceNode(node);
      }
      else if (type == NULL) {
        return new JssNullNode(node);
      }
      else if (type == OBJECT) {
        return new JssObjectNode(node);
      }
      else if (type == PROPERTIES_KEY) {
        return new JssPropertiesKeyNode(node);
      }
      else if (type == PROPERTIES_STATEMENT) {
        return new JssPropertiesStatementNode(node);
      }
      else if (type == PROPERTY) {
        return new JssPropertyNode(node);
      }
      else if (type == PROPERTY_MARK) {
        return new JssPropertyMarkNode(node);
      }
      else if (type == SCHEMA) {
        return new JssSchemaNode(node);
      }
      else if (type == SCHEMA_STATEMENT) {
        return new JssSchemaStatementNode(node);
      }
      else if (type == STRING_INLINE) {
        return new JssStringInlineNode(node);
      }
      else if (type == STRING_MULTI) {
        return new JssStringMultiNode(node);
      }
      else if (type == TYPE_HINT) {
        return new JssTypeHintNode(node);
      }
      else if (type == URL_MAYBE_VALID) {
        return new JssUrlMaybeValidNode(node);
      }
      else if (type == VALUE) {
        return new JssValueNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
