package io.github.intellij.dlanguage.surround

import com.intellij.lang.surroundWith.Surrounder
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.TextRange
import com.intellij.psi.JavaPsiFacade
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.codeStyle.JavaCodeStyleManager

class DLangTryCatchSurrounder : Surrounder {

    private val descriptor : String = "try-catch";

    override fun isApplicable(elements: Array<out PsiElement>): Boolean {
        return true;
    }

    override fun surroundElements(project: Project, editor: Editor, elements: Array<out PsiElement>): TextRange? {
        val manager = PsiManager.getInstance(project)
        val factory = JavaPsiFacade.getInstance(manager.project).elementFactory
        val codeStyleManager = JavaCodeStyleManager.getInstance(project)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTemplateDescription(): String {
        return descriptor;
    }

}
