// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.github.valkyrie.ide.view.grouper

import com.github.valkyrie.ValkyrieBundle
import com.intellij.ide.util.treeView.AbstractTreeNode
import com.intellij.ide.util.treeView.smartTree.*
import com.intellij.psi.PsiElement
import com.intellij.util.PlatformIcons
import org.jetbrains.annotations.NonNls

object PropertiesGrouper : Grouper {
    override fun getPresentation(): ActionPresentation = ActionPresentationData(
        ValkyrieBundle.message("view.PropertiesGrouper"),
        "GGGGG",
        PlatformIcons.ABSTRACT_CLASS_ICON
    )

    override fun getName(): String {
        return ValkyrieBundle.message("view.PropertiesGrouper")
    }

    override fun group(
        parent: AbstractTreeNode<*>,
        children: MutableCollection<TreeElement>,
    ): MutableCollection<Group> {
        return arrayListOf()
    }
}