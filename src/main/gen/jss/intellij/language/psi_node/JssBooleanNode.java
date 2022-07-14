// This is a generated file. Not intended for manual editing.
package jss.intellij.language.psi_node;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import jss.intellij.language.mixin.MixinArray;
import jss.intellij.language.psi.*;

public class JssBooleanNode extends MixinArray implements JssBoolean {

  public JssBooleanNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitBoolean(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

}
