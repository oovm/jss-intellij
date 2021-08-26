package com.github.oovm.jssintellij.services

import com.intellij.openapi.project.Project
import com.github.oovm.jssintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
