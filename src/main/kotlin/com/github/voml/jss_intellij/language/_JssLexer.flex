package com.github.voml.jss_intellij.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.voml.jss_intellij.language.psi.JssTypes.*;

%%

%{
  public _JssLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _JssLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

COMMENT_DOCUMENT=("///")[^\r\n]*
COMMENT=("//")[^\r\n]*
COMMENT_BLOCK=[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
URL= [A-Za-z0-9]+:"//"[\-\p{XID_Continue}./?&#]+
SYMBOL=[\p{XID_Start}_][\p{XID_Continue}_]*
STRING=\"([^\"\\]|\\.)*\"
BYTE=(0[bBoOxXfF][0-9A-Fa-f][0-9A-Fa-f_]*)
INTEGER=(0|[1-9][0-9_]*)
DECIMAL=([0-9]+\.[0-9]*([*][*][0-9]+)?)|(\.[0-9]+([Ee][0-9]+)?)
SIGN=[+-]
NON_ESCAPE=[^\\]

%%
<YYINITIAL> {
  {WHITE_SPACE}           { return WHITE_SPACE; }

  "("                     { return PARENTHESIS_L; }
  ")"                     { return PARENTHESIS_R; }
  "["                     { return BRACKET_L; }
  "]"                     { return BRACKET_R; }
  "{"                     { return BRACE_L; }
  "}"                     { return BRACE_R; }
  "^"                     { return ACCENT; }
  "<"                     { return ANGLE_L; }
  ">"                     { return ANGLE_R; }
  "\""                    { return QUOTATION; }
  "\\"                    { return ESCAPE; }
  "="                     { return EQ; }
  "nan"                   { return NAN; }
  ":"                     { return COLON; }
  ";"                     { return SEMICOLON; }
  ","                     { return COMMA; }
  "$"                     { return DOLLAR; }
  "."                     { return DOT; }
  "*"                     { return STAR; }
  "@"                     { return AT; }
  "DEFINE"                { return DEFINE; }
  "AS"                    { return AS; }
  "CITE"                  { return CITE; }

  {COMMENT_DOCUMENT}      { return COMMENT_DOCUMENT; }
  {COMMENT}               { return COMMENT; }
  {COMMENT_BLOCK}         { return COMMENT_BLOCK; }
  {URL}                   { return URL; }
  {SYMBOL}                { return SYMBOL; }
  {STRING}                { return STRING; }
  {BYTE}                  { return BYTE; }
  {INTEGER}               { return INTEGER; }
  {DECIMAL}               { return DECIMAL; }
  {SIGN}                  { return SIGN; }
  {NON_ESCAPE}            { return NON_ESCAPE; }

}

[^] { return BAD_CHARACTER; }
