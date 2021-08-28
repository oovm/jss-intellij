// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VomlIncludeStatement extends PsiElement {

  @Nullable
  VomlKeySymbol getKeySymbol();

  @Nullable
  VomlPaired getPaired();

  @NotNull
  VomlStringInline getStringInline();

  @Nullable
  VomlStringPrefix getStringPrefix();

}
