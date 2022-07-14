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

public class JssArrayNode extends ASTWrapperPsiElement implements JssArray {

  public JssArrayNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitArray(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JssBracketBlock getBracketBlock() {
    return findNotNullChildByClass(JssBracketBlock.class);
  }

}
