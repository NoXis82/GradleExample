plugins {
    id("application")
    id("my-java-base")
}

val myBuildGroup = "my project build"
tasks.named("run") {
    group = myBuildGroup
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

tasks.test {
    useJUnitPlatform()
}