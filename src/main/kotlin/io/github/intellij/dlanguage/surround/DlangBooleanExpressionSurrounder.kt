package io.github.intellij.dlanguage.surround

import com.intellij.psi.PsiExpression
import com.intellij.psi.PsiPrimitiveType
import com.intellij.psi.PsiType
import io.github.intellij.dlanguage.psi.DlangTypes

abstract class DlangBooleanExpressionSurrounder : DlangExpressionSurrounder() {
    override fun isApplicable(expr: PsiExpression): Boolean {
        val type = expr.type
        return type !=null && (DlangTypes.boo)
        return type != null && (PsiType.BOOLEAN == type || PsiType.BOOLEAN == PsiPrimitiveType.getUnboxedType(type))
    }
}
