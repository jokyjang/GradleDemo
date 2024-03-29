/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java project to get you started.
 * For more details take a look at the Java Quickstart chapter in the Gradle
 * User Manual available at https://docs.gradle.org/5.5/userguide/tutorial_java_projects.html
 */

plugins {
    java
    // Apply the application plugin to add support for building a CLI application
    application
}

dependencies {
    implementation(project(":java-library"))
    // This dependency is used by the application.
    implementation("com.google.guava:guava:27.1-jre")

    // Use JUnit test framework
    testImplementation("junit:junit:4.12")
}

application {
    // Define the main class for the application
    mainClassName = "zzx.application.App"
}
