package jss.intellij.language.file

import com.intellij.icons.AllIcons
import com.intellij.openapi.util.IconLoader

object JssIcons {
    val FILE = IconLoader.getIcon("/icons/jssIcon.svg", JssIcons::class.java)
    val SCHEMA = AllIcons.Actions.DependencyAnalyzer
    val IDIOM = AllIcons.Actions.ShortcutFilter
    val PROPERTY = AllIcons.Nodes.Property
    val ANNOTATION = AllIcons.Nodes.ObjectTypeAttribute
}