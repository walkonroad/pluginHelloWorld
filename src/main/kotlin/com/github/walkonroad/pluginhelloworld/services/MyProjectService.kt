package com.github.walkonroad.pluginhelloworld.services

import com.intellij.openapi.project.Project
import com.github.walkonroad.pluginhelloworld.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
