/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package jss.intellij.ide.doc

import jss.intellij.language.psi.JssUrlMaybeValid
import com.intellij.patterns.PlatformPatterns
import com.intellij.patterns.PsiElementPattern
import com.intellij.psi.PsiReferenceContributor
import com.intellij.psi.PsiReferenceRegistrar


class JssUrlReferenceContributor : PsiReferenceContributor() {

    override fun registerReferenceProviders(registrar: PsiReferenceRegistrar) {
//        if (tomlPluginIsAbiCompatible()) {
//            registrar.registerReferenceProvider(
//                onDependencyKey or onSpecificDependencyHeaderKey,
//                CargoDependencyReferenceProvider()
//            )
//            for (type in PathPatternType.values()) {
//                registrar.registerReferenceProvider(type.pattern, CargoTomlFileReferenceProvider(type))
//            }
//        }
        val psiLiteralExpressionCapture: PsiElementPattern.Capture<JssUrlMaybeValid> = PlatformPatterns.psiElement(
            JssUrlMaybeValid::class.java
        )
        registrar.registerReferenceProvider(psiLiteralExpressionCapture, JssUrlReferenceProvider())
    }
}