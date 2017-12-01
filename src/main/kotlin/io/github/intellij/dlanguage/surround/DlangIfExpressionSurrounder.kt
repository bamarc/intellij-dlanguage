package io.github.intellij.dlanguage.surround

import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiExpression
import com.intellij.psi.PsiExpressionStatement

class DlangIfExpressionSurrounder : DlangExpressionSurrounder() {
    override fun isApplicable(expr: PsiExpression): Boolean {
        if (!super.isApplicable(expr)) return false
        if (!expr.isPhysical) return false
        val expressionStatement = expr.parent as? PsiExpressionStatement ?: return false
    }

    override fun surroundExpression(project: Project, editor: Editor, expr: PsiExpression): TextRange {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTemplateDescription(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
