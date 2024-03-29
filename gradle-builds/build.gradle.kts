/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds
 */

plugins {
    id("base")
}

tasks.create<Copy>("copy") {
    description = "Copied sources to the dest directory"
    group = "Custom"
    from("src")
    into("dest")
}

tasks.create<Zip>("zip") {
    description = "Auchive sources into zip file"
    group = "Archive"

    from("src")
//    archiveFileName.set("basic-demo-1.0.zip")
}