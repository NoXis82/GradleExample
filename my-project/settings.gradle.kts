rootProject.name = "my-project"

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

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    includeBuild("../my-other-project")
}

include("app")
include("business-logic")
include("data-module")
//rootDir.listFiles()?.filter {
//    it.isDirectory && !it.isHidden
//}?.forEach {
//  include(it.name)
//}