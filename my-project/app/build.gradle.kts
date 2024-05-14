
plugins {
    id("my-java-application")
//    kotlin("jvm") version "1.9.23"
}

//application {
//    mainClass.set("MyApplication")
//}
//tasks.generateStartScript {
//    mainClass.set("myproject.MyApplication")
//}
myApp {
    mainClass.set("myproject.MyApplication")
}

dependencies {
    implementation(project(":business-logic"))
//    implementation(kotlin("stdlib-jdk8"))
}
//repositories {
//    mavenCentral()
//}
//kotlin {
//    jvmToolchain(11)
//}