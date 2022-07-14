package jss.intellij.ide.view.grouper

import com.intellij.icons.AllIcons
import com.intellij.ide.util.treeView.AbstractTreeNode
import com.intellij.ide.util.treeView.smartTree.*
import jss.intellij.language.file.JssBundle

object PropertiesGrouper : Grouper {
    override fun getName(): String = "action.view.grouper.properties"
    override fun getPresentation(): ActionPresentation = ActionPresentationData(
        JssBundle.message(name),
        null,
        AllIcons.Nodes.AbstractClass
    )

    override fun group(parent: AbstractTreeNode<*>, children: MutableCollection<TreeElement>): MutableCollection<Group> {
        return arrayListOf()
    }
}