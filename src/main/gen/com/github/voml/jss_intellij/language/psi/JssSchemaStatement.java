// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JssSchemaStatement extends PsiElement {

  @Nullable
  JssAnnoStatement getAnnoStatement();

  @Nullable
  JssIdiomStatement getIdiomStatement();

  @Nullable
  JssPropertiesStatement getPropertiesStatement();

  @NotNull
  JssTypeSymbol getTypeSymbol();

  @NotNull
  PsiElement getSymbol();

}
