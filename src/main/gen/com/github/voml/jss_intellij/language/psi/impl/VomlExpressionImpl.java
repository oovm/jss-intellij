// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.voml.jss_intellij.language.psi.*;

public class VomlExpressionImpl extends ASTWrapperPsiElement implements VomlExpression {

  public VomlExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VomlVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VomlVisitor) accept((VomlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VomlAnnotation getAnnotation() {
    return findChildByClass(VomlAnnotation.class);
  }

  @Override
  @Nullable
  public VomlBackTop getBackTop() {
    return findChildByClass(VomlBackTop.class);
  }

  @Override
  @Nullable
  public VomlExportStatement getExportStatement() {
    return findChildByClass(VomlExportStatement.class);
  }

  @Override
  @Nullable
  public VomlIncludeStatement getIncludeStatement() {
    return findChildByClass(VomlIncludeStatement.class);
  }

  @Override
  @Nullable
  public VomlInheritStatement getInheritStatement() {
    return findChildByClass(VomlInheritStatement.class);
  }

  @Override
  @Nullable
  public VomlInsertItem getInsertItem() {
    return findChildByClass(VomlInsertItem.class);
  }

  @Override
  @Nullable
  public VomlInsertPair getInsertPair() {
    return findChildByClass(VomlInsertPair.class);
  }

  @Override
  @Nullable
  public VomlScope getScope() {
    return findChildByClass(VomlScope.class);
  }

}
