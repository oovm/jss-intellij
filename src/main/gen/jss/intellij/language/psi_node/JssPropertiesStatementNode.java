// This is a generated file. Not intended for manual editing.
package jss.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static jss.intellij.language.psi.JssTypes.*;
import jss.intellij.language.mixin.MixinProperty;
import jss.intellij.language.psi.*;
import jss.intellij.language.mixin.NodeExtension;

public class JssPropertiesStatementNode extends MixinProperty implements JssPropertiesStatement {

  public JssPropertiesStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitPropertiesStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JssPropertiesBlock getPropertiesBlock() {
    return findChildByClass(JssPropertiesBlock.class);
  }

  @Override
  @NotNull
  public JssPropertiesKey getPropertiesKey() {
    return findNotNullChildByClass(JssPropertiesKey.class);
  }

  @Override
  @NotNull
  public JssPropertiesMark getPropertiesMark() {
    return findNotNullChildByClass(JssPropertiesMark.class);
  }

  @Override
  @Nullable
  public JssTypeHint getTypeHint() {
    return findChildByClass(JssTypeHint.class);
  }

}
