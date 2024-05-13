plugins {
    id("my-java-library")
}


dependencies {
    implementation(project(":data-module"))
    implementation("org.apache.commons:commons-lang3:3.9")
}
