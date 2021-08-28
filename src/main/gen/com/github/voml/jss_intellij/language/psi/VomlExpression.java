// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VomlExpression extends PsiElement {

  @Nullable
  VomlAnnotation getAnnotation();

  @Nullable
  VomlBackTop getBackTop();

  @Nullable
  VomlExportStatement getExportStatement();

  @Nullable
  VomlIncludeStatement getIncludeStatement();

  @Nullable
  VomlInheritStatement getInheritStatement();

  @Nullable
  VomlInsertItem getInsertItem();

  @Nullable
  VomlInsertPair getInsertPair();

  @Nullable
  VomlScope getScope();

}