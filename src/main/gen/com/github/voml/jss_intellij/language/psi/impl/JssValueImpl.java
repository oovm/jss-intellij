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

public class JssValueImpl extends ASTWrapperPsiElement implements JssValue {

  public JssValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitValue(this);
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
  public JssNumberSuffix getNumberSuffix() {
    return findChildByClass(JssNumberSuffix.class);
  }

  @Override
  @Nullable
  public JssRef getRef() {
    return findChildByClass(JssRef.class);
  }

  @Override
  @Nullable
  public JssStringInline getStringInline() {
    return findChildByClass(JssStringInline.class);
  }

  @Override
  @Nullable
  public JssStringMulti getStringMulti() {
    return findChildByClass(JssStringMulti.class);
  }

  @Override
  @Nullable
  public JssStringPrefix getStringPrefix() {
    return findChildByClass(JssStringPrefix.class);
  }

  @Override
  @Nullable
  public JssTable getTable() {
    return findChildByClass(JssTable.class);
  }

  @Override
  @Nullable
  public PsiElement getBoolean() {
    return findChildByType(BOOLEAN);
  }

  @Override
  @Nullable
  public PsiElement getByte() {
    return findChildByType(BYTE);
  }

  @Override
  @Nullable
  public PsiElement getDecimal() {
    return findChildByType(DECIMAL);
  }

  @Override
  @Nullable
  public PsiElement getInteger() {
    return findChildByType(INTEGER);
  }

  @Override
  @Nullable
  public PsiElement getSign() {
    return findChildByType(SIGN);
  }

}
