// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JssValue extends PsiElement {

  @Nullable
  JssAnnotation getAnnotation();

  @Nullable
  JssNumberSuffix getNumberSuffix();

  @Nullable
  JssRef getRef();

  @Nullable
  JssStringInline getStringInline();

  @Nullable
  JssStringMulti getStringMulti();

  @Nullable
  JssStringPrefix getStringPrefix();

  @Nullable
  JssTable getTable();

  @Nullable
  PsiElement getBoolean();

  @Nullable
  PsiElement getByte();

  @Nullable
  PsiElement getDecimal();

  @Nullable
  PsiElement getInteger();

  @Nullable
  PsiElement getSign();

}
