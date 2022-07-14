package jss.intellij.ide.view


import com.github.valkyrie.ide.view.filter.MainInfoFilter
import com.github.valkyrie.ide.view.filter.PublicElementsFilter
import com.github.valkyrie.ide.view.grouper.PropertiesGrouper
import com.intellij.ide.structureView.StructureViewModel.ElementInfoProvider
import com.intellij.ide.structureView.StructureViewModelBase
import com.intellij.ide.structureView.StructureViewTreeElement
import com.intellij.ide.util.treeView.smartTree.Sorter
import com.intellij.psi.PsiFile
import jss.intellij.ide.view.JssViewElement


class JssViewModel(psiFile: PsiFile?) : StructureViewModelBase(psiFile!!, JssViewElement(psiFile)),
    ElementInfoProvider {
    override fun getSorters() = arrayOf(Sorter.ALPHA_SORTER)

    override fun getFilters() = arrayOf(PublicElementsFilter, MainInfoFilter)

    override fun getGroupers() = arrayOf(PropertiesGrouper)

    override fun isAlwaysShowsPlus(element: StructureViewTreeElement): Boolean {
        return false
    }

    override fun isAlwaysLeaf(element: StructureViewTreeElement): Boolean {
        // return element.value is ValkyrieBitflagStatement
        return false
    }
}

