// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.voml.jss_intellij.language.psi.*;

public class VomlTableImpl extends ASTWrapperPsiElement implements VomlTable {

  public VomlTableImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VomlVisitor visitor) {
    visitor.visitTable(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VomlVisitor) accept((VomlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VomlPaired getPaired() {
    return findNotNullChildByClass(VomlPaired.class);
  }

  @Override
  @Nullable
  public VomlTypeHint getTypeHint() {
    return findChildByClass(VomlTypeHint.class);
  }

}
