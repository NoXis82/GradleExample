plugins {
    id("my-java-application")
}

application {
    mainClass.set("MyApplication")
}

dependencies {
    implementation(project(":business-logic"))
}