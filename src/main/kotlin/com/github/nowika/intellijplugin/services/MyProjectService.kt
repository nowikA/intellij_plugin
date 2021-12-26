package com.github.nowika.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.nowika.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
