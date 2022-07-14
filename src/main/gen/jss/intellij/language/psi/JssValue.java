// This is a generated file. Not intended for manual editing.
package jss.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JssValue extends PsiElement {

  @Nullable
  JssArray getArray();

  @Nullable
  JssBoolean getBoolean();

  @Nullable
  JssNull getNull();

  @Nullable
  JssObject getObject();

  @Nullable
  JssStringInline getStringInline();

  @Nullable
  JssStringMulti getStringMulti();

  @Nullable
  JssUrlMaybeValid getUrlMaybeValid();

}