// This is a generated file. Not intended for manual editing.
package jss.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JssPropertiesStatement extends PsiElement {

  @Nullable
  JssBraceBlock getBraceBlock();

  @NotNull
  JssPropertiesKey getPropertiesKey();

  @NotNull
  JssProperty getProperty();

  @Nullable
  JssTypeHint getTypeHint();

}
