rootProject.name = "my-project"

// Locations of Gradle plugins
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
    includeBuild("../my-build-logic")
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

// Location of other components
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    includeBuild("../my-other-project")
    includeBuild(".")
}

include("app")
include("business-logic")
include("data-module")
//rootDir.listFiles()?.filter {
//    it.isDirectory && !it.isHidden
//}?.forEach {
//  include(it.name)
//}