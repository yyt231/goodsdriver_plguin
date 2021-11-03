package com.github.yyt231.goodsdriverplguin.services

import com.intellij.openapi.project.Project
import com.github.yyt231.goodsdriverplguin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
