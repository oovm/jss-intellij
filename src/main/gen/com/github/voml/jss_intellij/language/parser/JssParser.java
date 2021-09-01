// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.voml.jss_intellij.language.psi.JssTypes.*;
import static com.github.voml.jss_intellij.language.psi.JssParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class JssParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return Jss(b, l + 1);
  }

  /* ********************************************************** */
  // statement*
  static boolean Jss(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Jss")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Jss", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // STRING | SYMBOL
  static boolean anno_key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anno_key")) return false;
    if (!nextTokenIs(b, "", STRING, SYMBOL)) return false;
    boolean r;
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, SYMBOL);
    return r;
  }

  /* ********************************************************** */
  // anno_key set value
  public static boolean anno_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anno_statement")) return false;
    if (!nextTokenIs(b, "<anno statement>", STRING, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANNO_STATEMENT, "<anno statement>");
    r = anno_key(b, l + 1);
    r = r && set(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BRACE_L <<param>> BRACE_R
  static boolean brace(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "brace")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BRACKET_L <<param>> BRACKET_R
  static boolean bracket(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "bracket")) return false;
    if (!nextTokenIs(b, BRACKET_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, BRACKET_R);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // escaped | NON_ESCAPE
  static boolean char_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "char_$")) return false;
    if (!nextTokenIs(b, "", ESCAPE, NON_ESCAPE)) return false;
    boolean r;
    r = escaped(b, l + 1);
    if (!r) r = consumeToken(b, NON_ESCAPE);
    return r;
  }

  /* ********************************************************** */
  // DEFINE SYMBOL (AS key_symbol | <<paired include_inner>>)
  public static boolean def_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_statement")) return false;
    if (!nextTokenIs(b, DEFINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEFINE, SYMBOL);
    r = r && def_statement_2(b, l + 1);
    exit_section_(b, m, DEF_STATEMENT, r);
    return r;
  }

  // AS key_symbol | <<paired include_inner>>
  private static boolean def_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = def_statement_2_0(b, l + 1);
    if (!r) r = paired(b, l + 1, JssParser::include_inner);
    exit_section_(b, m, null, r);
    return r;
  }

  // AS key_symbol
  private static boolean def_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_statement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && key_symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EQ | COLON
  static boolean eq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eq")) return false;
    if (!nextTokenIs(b, "", COLON, EQ)) return false;
    boolean r;
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, COLON);
    return r;
  }

  /* ********************************************************** */
  // ESCAPE (ESCAPE|NON_ESCAPE)
  public static boolean escaped(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "escaped")) return false;
    if (!nextTokenIs(b, ESCAPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ESCAPE);
    r = r && escaped_1(b, l + 1);
    exit_section_(b, m, ESCAPED, r);
    return r;
  }

  // ESCAPE|NON_ESCAPE
  private static boolean escaped_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "escaped_1")) return false;
    boolean r;
    r = consumeToken(b, ESCAPE);
    if (!r) r = consumeToken(b, NON_ESCAPE);
    return r;
  }

  /* ********************************************************** */
  // DOLLAR
  public static boolean idiom_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idiom_mark")) return false;
    if (!nextTokenIs(b, DOLLAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOLLAR);
    exit_section_(b, m, IDIOM_MARK, r);
    return r;
  }

  /* ********************************************************** */
  // idiom_mark idiom_symbol [COLON] value
  public static boolean idiom_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idiom_statement")) return false;
    if (!nextTokenIs(b, DOLLAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = idiom_mark(b, l + 1);
    r = r && idiom_symbol(b, l + 1);
    r = r && idiom_statement_2(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, m, IDIOM_STATEMENT, r);
    return r;
  }

  // [COLON]
  private static boolean idiom_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idiom_statement_2")) return false;
    consumeToken(b, COLON);
    return true;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean idiom_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idiom_symbol")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, IDIOM_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // SEMICOLON | COMMA
  static boolean ignore(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ignore")) return false;
    if (!nextTokenIs(b, "", COMMA, SEMICOLON)) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, COMMA);
    return r;
  }

  /* ********************************************************** */
  // key_symbol*
  static boolean include_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_inner")) return false;
    while (true) {
      int c = current_position_(b);
      if (!key_symbol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "include_inner", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // string_inline | key_symbol | INTEGER
  static boolean key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key")) return false;
    boolean r;
    r = string_inline(b, l + 1);
    if (!r) r = key_symbol(b, l + 1);
    if (!r) r = consumeToken(b, INTEGER);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean key_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_symbol")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, KEY_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // [SIGN] (INTEGER | DECIMAL) [number_suffix] | [SIGN] BYTE | other_num
  static boolean num(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = num_0(b, l + 1);
    if (!r) r = num_1(b, l + 1);
    if (!r) r = other_num(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN] (INTEGER | DECIMAL) [number_suffix]
  private static boolean num_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = num_0_0(b, l + 1);
    r = r && num_0_1(b, l + 1);
    r = r && num_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN]
  private static boolean num_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0_0")) return false;
    consumeToken(b, SIGN);
    return true;
  }

  // INTEGER | DECIMAL
  private static boolean num_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0_1")) return false;
    boolean r;
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DECIMAL);
    return r;
  }

  // [number_suffix]
  private static boolean num_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0_2")) return false;
    number_suffix(b, l + 1);
    return true;
  }

  // [SIGN] BYTE
  private static boolean num_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = num_1_0(b, l + 1);
    r = r && consumeToken(b, BYTE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN]
  private static boolean num_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_1_0")) return false;
    consumeToken(b, SIGN);
    return true;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean number_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_suffix")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, NUMBER_SUFFIX, r);
    return r;
  }

  /* ********************************************************** */
  // NAN
  static boolean other_num(PsiBuilder b, int l) {
    return consumeToken(b, NAN);
  }

  /* ********************************************************** */
  // symbol_path eq value
  public static boolean pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAIR, "<pair>");
    r = symbol_path(b, l + 1);
    r = r && eq(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PARENTHESIS_L <<param>> PARENTHESIS_R
  //   | BRACKET_L <<param>> BRACKET_R
  //   | BRACE_L <<param>> BRACE_R
  public static boolean paired(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "paired")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = paired_0(b, l + 1, _param);
    if (!r) r = paired_1(b, l + 1, _param);
    if (!r) r = paired_2(b, l + 1, _param);
    exit_section_(b, m, PAIRED, r);
    return r;
  }

  // PARENTHESIS_L <<param>> PARENTHESIS_R
  private static boolean paired_0(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "paired_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // BRACKET_L <<param>> BRACKET_R
  private static boolean paired_1(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "paired_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, BRACKET_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // BRACE_L <<param>> BRACE_R
  private static boolean paired_2(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "paired_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PARENTHESIS_L <<param>> PARENTHESIS_R
  static boolean parenthesis(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "parenthesis")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<brace [properties_inner]>>
  public static boolean properties_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "properties_block")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = brace(b, l + 1, JssParser::properties_block_0_0);
    exit_section_(b, m, PROPERTIES_BLOCK, r);
    return r;
  }

  // [properties_inner]
  private static boolean properties_block_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "properties_block_0_0")) return false;
    properties_inner(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // idiom_statement
  //   | properties_statement
  //   | anno_statement
  //   | ignore
  static boolean properties_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "properties_inner")) return false;
    boolean r;
    r = idiom_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    if (!r) r = anno_statement(b, l + 1);
    if (!r) r = ignore(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // STRING | SYMBOL
  public static boolean properties_ley(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "properties_ley")) return false;
    if (!nextTokenIs(b, "<properties ley>", STRING, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTIES_LEY, "<properties ley>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, SYMBOL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DOT
  public static boolean properties_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "properties_mark")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    exit_section_(b, m, PROPERTIES_MARK, r);
    return r;
  }

  /* ********************************************************** */
  // (PROP|properties_mark) properties_ley type_hint [properties_block]
  public static boolean properties_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "properties_statement")) return false;
    if (!nextTokenIs(b, "<properties statement>", DOT, PROP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTIES_STATEMENT, "<properties statement>");
    r = properties_statement_0(b, l + 1);
    r = r && properties_ley(b, l + 1);
    r = r && type_hint(b, l + 1);
    r = r && properties_statement_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PROP|properties_mark
  private static boolean properties_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "properties_statement_0")) return false;
    boolean r;
    r = consumeToken(b, PROP);
    if (!r) r = properties_mark(b, l + 1);
    return r;
  }

  // [properties_block]
  private static boolean properties_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "properties_statement_3")) return false;
    properties_block(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // CITE symbol_path
  public static boolean ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref")) return false;
    if (!nextTokenIs(b, CITE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CITE);
    r = r && symbol_path(b, l + 1);
    exit_section_(b, m, REF, r);
    return r;
  }

  /* ********************************************************** */
  // SCHEMA SYMBOL type_hint <<brace properties_inner>>
  public static boolean schema_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "schema_statement")) return false;
    if (!nextTokenIs(b, SCHEMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SCHEMA, SYMBOL);
    r = r && type_hint(b, l + 1);
    r = r && brace(b, l + 1, JssParser::properties_inner);
    exit_section_(b, m, SCHEMA_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // COLON
  static boolean set(PsiBuilder b, int l) {
    return consumeToken(b, COLON);
  }

  /* ********************************************************** */
  // schema_statement
  //   | properties_statement
  //   | def_statement
  //   | COMMENT_DOCUMENT
  //   | ignore
  static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    r = schema_statement(b, l + 1);
    if (!r) r = properties_statement(b, l + 1);
    if (!r) r = def_statement(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT_DOCUMENT);
    if (!r) r = ignore(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // [string_prefix] (string_inline|string_multi)
  static boolean str(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "str")) return false;
    if (!nextTokenIs(b, "", QUOTATION, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = str_0(b, l + 1);
    r = r && str_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [string_prefix]
  private static boolean str_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "str_0")) return false;
    string_prefix(b, l + 1);
    return true;
  }

  // string_inline|string_multi
  private static boolean str_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "str_1")) return false;
    boolean r;
    r = string_inline(b, l + 1);
    if (!r) r = string_multi(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // QUOTATION char* QUOTATION
  public static boolean string_inline(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_inline")) return false;
    if (!nextTokenIs(b, QUOTATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTATION);
    r = r && string_inline_1(b, l + 1);
    r = r && consumeToken(b, QUOTATION);
    exit_section_(b, m, STRING_INLINE, r);
    return r;
  }

  // char*
  private static boolean string_inline_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_inline_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!char_$(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_inline_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // QUOTATION char* QUOTATION
  public static boolean string_multi(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_multi")) return false;
    if (!nextTokenIs(b, QUOTATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTATION);
    r = r && string_multi_1(b, l + 1);
    r = r && consumeToken(b, QUOTATION);
    exit_section_(b, m, STRING_MULTI, r);
    return r;
  }

  // char*
  private static boolean string_multi_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_multi_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!char_$(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_multi_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean string_prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_prefix")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, STRING_PREFIX, r);
    return r;
  }

  /* ********************************************************** */
  // key (DOT key)*
  public static boolean symbol_path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_path")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL_PATH, "<symbol path>");
    r = key(b, l + 1);
    r = r && symbol_path_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DOT key)*
  private static boolean symbol_path_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_path_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!symbol_path_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbol_path_1", c)) break;
    }
    return true;
  }

  // DOT key
  private static boolean symbol_path_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_path_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && key(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [type_hint] <<paired table_inner>>
  public static boolean table(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE, "<table>");
    r = table_0(b, l + 1);
    r = r && paired(b, l + 1, JssParser::table_inner);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [type_hint]
  private static boolean table_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_0")) return false;
    type_hint(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [table_item (COMMA table_item)* [COMMA]]
  static boolean table_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner")) return false;
    table_inner_0(b, l + 1);
    return true;
  }

  // table_item (COMMA table_item)* [COMMA]
  private static boolean table_inner_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_item(b, l + 1);
    r = r && table_inner_0_1(b, l + 1);
    r = r && table_inner_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA table_item)*
  private static boolean table_inner_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!table_inner_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "table_inner_0_1", c)) break;
    }
    return true;
  }

  // COMMA table_item
  private static boolean table_inner_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && table_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean table_inner_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // pair | value
  static boolean table_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_item")) return false;
    boolean r;
    r = pair(b, l + 1);
    if (!r) r = value(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // COLON type_symbol
  static boolean type_hint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_hint")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type_symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean type_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_symbol")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, TYPE_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // URL
  public static boolean url_maybe_valid(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "url_maybe_valid")) return false;
    if (!nextTokenIs(b, URL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, URL);
    exit_section_(b, m, URL_MAYBE_VALID, r);
    return r;
  }

  /* ********************************************************** */
  // NULL | BOOLEAN | num | ref | str | table | annotation | url_maybe_valid
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, BOOLEAN);
    if (!r) r = num(b, l + 1);
    if (!r) r = ref(b, l + 1);
    if (!r) r = str(b, l + 1);
    if (!r) r = table(b, l + 1);
    if (!r) r = consumeToken(b, ANNOTATION);
    if (!r) r = url_maybe_valid(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
