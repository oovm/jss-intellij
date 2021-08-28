// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static com.github.voml.jss_intellij.language.psi.VomlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.voml.jss_intellij.language.psi.*;

public class VomlAnnotationMarkImpl extends ASTWrapperPsiElement implements VomlAnnotationMark {

  public VomlAnnotationMarkImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VomlVisitor visitor) {
    visitor.visitAnnotationMark(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VomlVisitor) accept((VomlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getSymbol() {
    return findNotNullChildByType(SYMBOL);
  }

}