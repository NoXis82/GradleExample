plugins {
    id("java-library")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

dependencies {
    implementation(project(":data-module"))
    implementation("org.apache.commons:commons-lang3:3.9")
}
