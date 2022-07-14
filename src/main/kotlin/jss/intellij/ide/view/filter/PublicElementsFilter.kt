package jss.intellij.ide.view.filter


import jss.intellij.ide.view.JssViewElement
import com.intellij.icons.AllIcons
import com.intellij.ide.util.treeView.smartTree.ActionPresentation
import com.intellij.ide.util.treeView.smartTree.ActionPresentationData
import com.intellij.ide.util.treeView.smartTree.Filter
import com.intellij.ide.util.treeView.smartTree.TreeElement
import jss.intellij.language.file.JssBundle


object PublicElementsFilter : Filter {

    override fun getName() = "action.view.filter.public"

    override fun isReverted() = true
    override fun getPresentation(): ActionPresentation = ActionPresentationData(
        JssBundle.message(name),
        null,
        AllIcons.Nodes.Public
    )
    override fun isVisible(treeNode: TreeElement): Boolean {
        return (treeNode as? JssViewElement)?.getVisibility() ?: true
    }
}
