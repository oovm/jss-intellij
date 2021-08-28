// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.voml.jss_intellij.language.psi.*;

public class VomlAnnotationImpl extends ASTWrapperPsiElement implements VomlAnnotation {

  public VomlAnnotationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VomlVisitor visitor) {
    visitor.visitAnnotation(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VomlVisitor) accept((VomlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VomlAnnotationMark getAnnotationMark() {
    return findNotNullChildByClass(VomlAnnotationMark.class);
  }

  @Override
  @NotNull
  public VomlPaired getPaired() {
    return findNotNullChildByClass(VomlPaired.class);
  }

}
