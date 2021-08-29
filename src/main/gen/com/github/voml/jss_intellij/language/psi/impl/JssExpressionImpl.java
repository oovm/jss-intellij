// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.voml.jss_intellij.language.psi.JssTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.voml.jss_intellij.language.psi.*;

public class JssExpressionImpl extends ASTWrapperPsiElement implements JssExpression {

  public JssExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JssAnnotation getAnnotation() {
    return findChildByClass(JssAnnotation.class);
  }

  @Override
  @Nullable
  public JssBackTop getBackTop() {
    return findChildByClass(JssBackTop.class);
  }

  @Override
  @Nullable
  public JssExportStatement getExportStatement() {
    return findChildByClass(JssExportStatement.class);
  }

  @Override
  @Nullable
  public JssIncludeStatement getIncludeStatement() {
    return findChildByClass(JssIncludeStatement.class);
  }

  @Override
  @Nullable
  public JssInheritStatement getInheritStatement() {
    return findChildByClass(JssInheritStatement.class);
  }

  @Override
  @Nullable
  public JssInsertItem getInsertItem() {
    return findChildByClass(JssInsertItem.class);
  }

  @Override
  @Nullable
  public JssInsertPair getInsertPair() {
    return findChildByClass(JssInsertPair.class);
  }

  @Override
  @Nullable
  public JssScope getScope() {
    return findChildByClass(JssScope.class);
  }

}
