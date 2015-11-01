// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static net.masterthought.dlanguage.psi.DLanguageTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.masterthought.dlanguage.psi.*;

public class DLanguageForeachImpl extends ASTWrapperPsiElement implements DLanguageForeach {

  public DLanguageForeachImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitForeach(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getKwForeach() {
    return findChildByType(KW_FOREACH);
  }

  @Override
  @Nullable
  public PsiElement getKwForeachReverse() {
    return findChildByType(KW_FOREACH_REVERSE);
  }

}
