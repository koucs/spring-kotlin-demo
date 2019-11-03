plugins {
    val kotlinVersion = "1.3.21"
    // val springBootVersion = "2.2.0.RELEASE"
    application
    kotlin("jvm") version kotlinVersion
    // https://kotlinlang.org/docs/reference/compiler-plugins.html#spring-support
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    idea
}

version = "1.0.0-SNAPSHOT"

application {
    mainClassName = "samples.HelloWorldKt"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}

repositories {
    jcenter()
}
