// This is a generated file. Not intended for manual editing.
package jss.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static jss.intellij.language.psi.JssTypes.*;
import jss.intellij.language.mixin.MixinValue;
import jss.intellij.language.psi.*;
import jss.intellij.language.mixin.NodeExtension;

public class JssValueNode extends MixinValue implements JssValue {

  public JssValueNode(@NotNull ASTNode node) {
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
  public JssArray getArray() {
    return findChildByClass(JssArray.class);
  }

  @Override
  @Nullable
  public JssBoolean getBoolean() {
    return findChildByClass(JssBoolean.class);
  }

  @Override
  @Nullable
  public JssNull getNull() {
    return findChildByClass(JssNull.class);
  }

  @Override
  @Nullable
  public JssObject getObject() {
    return findChildByClass(JssObject.class);
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
  public JssUrlMaybeValid getUrlMaybeValid() {
    return findChildByClass(JssUrlMaybeValid.class);
  }

}
