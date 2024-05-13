import gradle.kotlin.dsl.accessors._70a8c88598114635b3591220565bda80.java
import gradle.kotlin.dsl.accessors._70a8c88598114635b3591220565bda80.test

plugins {
    id("application")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

tasks.test {
    useJUnitPlatform()
}