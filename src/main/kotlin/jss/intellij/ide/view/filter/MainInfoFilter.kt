package jss.intellij.ide.view.filter


import com.intellij.icons.AllIcons
import com.intellij.ide.util.treeView.smartTree.ActionPresentation
import com.intellij.ide.util.treeView.smartTree.ActionPresentationData
import com.intellij.ide.util.treeView.smartTree.Filter
import com.intellij.ide.util.treeView.smartTree.TreeElement
import jss.intellij.ide.view.JssViewElement
import jss.intellij.language.file.JssBundle


object MainInfoFilter : Filter {

    override fun getName() = "action.view.filter.main_info"

    override fun isReverted() = true
    override fun getPresentation(): ActionPresentation = ActionPresentationData(
        JssBundle.message(name),
        null,
        AllIcons.Nodes.Favorite
    )

    override fun isVisible(node: TreeElement): Boolean {
        return (node as? JssViewElement)?.getVisibility() ?: true
    }
}
