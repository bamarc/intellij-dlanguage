package io.github.intellij.dlanguage.surround

import com.intellij.codeInsight.generation.surroundWith.JavaExpressionSurrounder
import com.intellij.lang.surroundWith.Surrounder
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.extensions.ExtensionPointName
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiExpression
import com.intellij.util.IncorrectOperationException
import java.util.*

abstract class DlangExpressionSurrounder : Surrounder{
    //val EP_NAME = ExtensionPointName.create<DlangExpressionSurrounder>("com.intellij.javaExpressionSurrounder")

    override fun isApplicable(elements: Array<PsiElement>): Boolean {
        return elements.size == 1 &&
            elements[0] is PsiExpression &&
            isApplicable(elements[0] as PsiExpression)
    }

    abstract fun isApplicable(expr: PsiExpression): Boolean

    @Throws(IncorrectOperationException::class)
    override fun surroundElements(project: Project,
                                  editor: Editor,
                                  elements: Array<PsiElement>): TextRange? {
        if (elements.size != 1 || elements[0] !is PsiExpression) {
            throw IllegalArgumentException(Arrays.toString(elements))
        }
        return surroundExpression(project, editor, elements[0] as PsiExpression)
    }

    @Throws(IncorrectOperationException::class)
    abstract fun surroundExpression(project: Project, editor: Editor, expr: PsiExpression): TextRange
}

