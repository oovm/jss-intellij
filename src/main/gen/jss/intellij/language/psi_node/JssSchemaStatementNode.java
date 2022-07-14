// This is a generated file. Not intended for manual editing.
package jss.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static jss.intellij.language.psi.JssTypes.*;
import jss.intellij.language.mixin.MixinSchema;
import jss.intellij.language.psi.*;
import jss.intellij.language.mixin.NodeExtension;

public class JssSchemaStatementNode extends MixinSchema implements JssSchemaStatement {

  public JssSchemaStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitSchemaStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JssBraceBlock getBraceBlock() {
    return findNotNullChildByClass(JssBraceBlock.class);
  }

  @Override
  @Nullable
  public JssTypeHint getTypeHint() {
    return findChildByClass(JssTypeHint.class);
  }

  @Override
  @NotNull
  public PsiElement getSymbol() {
    return findNotNullChildByType(SYMBOL);
  }

}
