plugins {
    id("my-java-library")
}


dependencies {
    api(project(":data-module"))
    implementation("org.apache.commons:commons-lang3")
    implementation("org.slf4j:slf4j-api")
    implementation("org.example.my-app:shared-utils")

    compileOnlyApi("com.google.errorprone:error_prone_annotations")
}
