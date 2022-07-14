// This is a generated file. Not intended for manual editing.
package jss.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static jss.intellij.language.psi.JssTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import jss.intellij.language.psi.*;
import jss.intellij.language.mixin.NodeExtension;

public class JssBracketBlockNode extends ASTWrapperPsiElement implements JssBracketBlock {

  public JssBracketBlockNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitBracketBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getBracketL() {
    return findNotNullChildByType(BRACKET_L);
  }

  @Override
  @NotNull
  public PsiElement getBracketR() {
    return findNotNullChildByType(BRACKET_R);
  }

}
