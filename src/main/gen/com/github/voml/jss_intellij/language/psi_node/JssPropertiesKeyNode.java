// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.psi_node;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static com.github.voml.jss_intellij.language.psi.JssTypes.*;
import com.github.voml.jss_intellij.language.mixin.MixinKey;
import com.github.voml.jss_intellij.language.psi.*;

public class JssPropertiesKeyNode extends MixinKey implements JssPropertiesKey {

  public JssPropertiesKeyNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitPropertiesKey(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

  @Override
  @Nullable
  public PsiElement getSymbol() {
    return findChildByType(SYMBOL);
  }

}
