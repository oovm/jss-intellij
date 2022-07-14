package com.github.valkyrie.ide.view.filter


import com.github.valkyrie.ValkyrieBundle
import jss.intellij.ide.view.JssViewElement
import com.intellij.icons.AllIcons
import com.intellij.ide.util.treeView.smartTree.ActionPresentation
import com.intellij.ide.util.treeView.smartTree.ActionPresentationData
import com.intellij.ide.util.treeView.smartTree.Filter
import com.intellij.ide.util.treeView.smartTree.TreeElement


object PublicElementsFilter : Filter {

    override fun getName() = "view.PublicElementsFilter"

    override fun isReverted() = true
    override fun getPresentation(): ActionPresentation = ActionPresentationData(
        ValkyrieBundle.message(name),
        null,
        AllIcons.Nodes.Public
    )
    override fun isVisible(treeNode: TreeElement): Boolean {
        return (treeNode as? JssViewElement)?.getVisibility() ?: true
    }
}
