plugins {
//    id("application")
    id("my-java-base")
}

//val myBuildGroup = "my project build"
//tasks.named("run") {
//    group = myBuildGroup
//}
//
//java {
//    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
//}
//
//tasks.test {
//    useJUnitPlatform()
//}

val packageApp = tasks.register<Zip>("packageApp") {
    from(layout.projectDirectory.file("run.sh"))
    from(tasks.jar) {
        into("libs")
    }
    from(configurations.runtimeClasspath) {
        into("libs")
    }
    destinationDirectory.set(layout.buildDirectory.dir("dist"))
    archiveFileName.set("myApplication.zip")
}

tasks.build {
    dependsOn(packageApp)
}