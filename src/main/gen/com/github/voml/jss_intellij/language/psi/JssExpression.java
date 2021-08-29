// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JssExpression extends PsiElement {

  @Nullable
  JssAnnotation getAnnotation();

  @Nullable
  JssBackTop getBackTop();

  @Nullable
  JssExportStatement getExportStatement();

  @Nullable
  JssIncludeStatement getIncludeStatement();

  @Nullable
  JssInheritStatement getInheritStatement();

  @Nullable
  JssInsertItem getInsertItem();

  @Nullable
  JssInsertPair getInsertPair();

  @Nullable
  JssScope getScope();

}
