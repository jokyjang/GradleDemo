plugins {
    war
    id("org.gretty").version("2.2.0")
}

//private val integrationTest: String = "integrationTest"

//sourceSets {
//    create("integrationTest") {
//        java.srcDir("src/it/java")
//        resources.srcDir("src/it/resources")
////        compileClasspath += sourceSets.main.get().output + sourceSets.test.get().compileClasspath
////        runtimeClasspath += output + compileClasspath + sourceSets["test"].runtimeClasspath
//    }
//}

//task<Test>("integrationTest") {
//    description = "Integration test for the service"
//    group = "verification"
//    classpath = sourceSets["integrationTest"].runtimeClasspath
//    testClassesDirs = sourceSets["integrationTest"].output.classesDirs
//    mustRunAfter("test")
////    useJUnitPlatform()
//}

gretty {
    integrationTestTask = "test"
}

//val integrationTestImplementation by configurations.getting {
//    extendsFrom(configurations.testImplementation.get())
//}

dependencies {
    providedCompile("javax.servlet:javax.servlet-api:3.1.0")
    testImplementation("junit:junit:4.12")
    testImplementation("org.mockito:mockito-core:2.7.19")
    testImplementation("io.github.bonigarcia:webdrivermanager:3.3.0")
    testImplementation("org.seleniumhq.selenium:selenium-java:3.141.59")
//    integrationTestImplementation("io.github.bonigarcia:webdrivermanager:1.6.1")
//    integrationTestImplementation("org.seleniumhq.selenium:selenium-java:3.3.1")
}
