// This is a generated file. Not intended for manual editing.
package jss.intellij.language.psi_node;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import jss.intellij.language.mixin.MixinAnnotation;
import jss.intellij.language.psi.*;

public class JssAnnoStatementNode extends MixinAnnotation implements JssAnnoStatement {

  public JssAnnoStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitAnnoStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JssKey getKey() {
    return findNotNullChildByClass(JssKey.class);
  }

  @Override
  @NotNull
  public JssValue getValue() {
    return findNotNullChildByClass(JssValue.class);
  }

}
