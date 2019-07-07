plugins {
    java
    id("org.springframework.boot").version("2.1.6.RELEASE")
    id("io.spring.dependency-management").version("1.0.8.RELEASE")
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:2.1.6.RELEASE"))
    implementation("org.springframework.boot:spring-boot-starter-web")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks {
    bootJar {
        mainClassName = "zzx.springboot.App"
    }
}