// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.voml.jss_intellij.language.psi.*;

public class VomlExportStatementImpl extends ASTWrapperPsiElement implements VomlExportStatement {

  public VomlExportStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VomlVisitor visitor) {
    visitor.visitExportStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VomlVisitor) accept((VomlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VomlStringInline getStringInline() {
    return findNotNullChildByClass(VomlStringInline.class);
  }

  @Override
  @Nullable
  public VomlStringPrefix getStringPrefix() {
    return findChildByClass(VomlStringPrefix.class);
  }

}
