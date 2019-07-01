plugins {
    java
    application
}

repositories {
    jcenter()
}

dependencies {
    implementation("com.github.lalyos:jfiglet:0.0.8")
}

application {
    mainClassName = "zzx.application.GreeterApp"
}