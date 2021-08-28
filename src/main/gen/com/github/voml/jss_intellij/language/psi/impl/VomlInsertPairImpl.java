// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.voml.jss_intellij.language.psi.*;

public class VomlInsertPairImpl extends ASTWrapperPsiElement implements VomlInsertPair {

  public VomlInsertPairImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VomlVisitor visitor) {
    visitor.visitInsertPair(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VomlVisitor) accept((VomlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VomlInsertDot getInsertDot() {
    return findChildByClass(VomlInsertDot.class);
  }

  @Override
  @NotNull
  public VomlPair getPair() {
    return findNotNullChildByClass(VomlPair.class);
  }

}
