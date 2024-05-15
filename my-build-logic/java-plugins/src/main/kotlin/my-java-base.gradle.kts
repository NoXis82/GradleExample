plugins {
    id("java")
    id("checkstyle")
}

//val myBuildGroup = "my project build"
//tasks.named<TaskReportTask>("tasks") {
//    displayGroup = myBuildGroup
//}
//
//tasks.build {
//    group = myBuildGroup
//    description = "Runs build..."
//}
//
//tasks.check {
//    group = myBuildGroup
//    description = "Runs checks (including tests)."
//}
//
//tasks.register("qualityCheck") {
//    group = myBuildGroup
//    description = "Runs checks (excluding tests)."
//    dependsOn(tasks.classes, tasks.checkstyleMain)
//    dependsOn(tasks.testClasses, tasks.checkstyleTest)
//}

group = "org.example.my-app"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

tasks.test {
    useJUnitPlatform()
    testLogging.showStandardStreams = true
}

dependencies.constraints {
    implementation("org.slf4j:slf4j-api:1.7.32")
    implementation("org.apache.commons:commons-lang3:3.9")
    implementation("com.google.errorprone:error_prone_annotations:2.9.0")
    implementation("org.slf4j:slf4j-simple:1.7.32")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}