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

public class JssIdiomStatementImpl extends ASTWrapperPsiElement implements JssIdiomStatement {

  public JssIdiomStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitIdiomStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JssPredefinedSymbol getPredefinedSymbol() {
    return findChildByClass(JssPredefinedSymbol.class);
  }

  @Override
  @Nullable
  public JssStringInline getStringInline() {
    return findChildByClass(JssStringInline.class);
  }

  @Override
  @Nullable
  public JssStringPrefix getStringPrefix() {
    return findChildByClass(JssStringPrefix.class);
  }

}
