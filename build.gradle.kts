plugins {
    val kotlinVersion = "1.3.41"
    val springBootVersion = "2.2.0.RELEASE"
    kotlin("jvm") version kotlinVersion
    // https://kotlinlang.org/docs/reference/compiler-plugins.html#spring-support
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("org.springframework.boot") version springBootVersion
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
    application
}

version = "1.0.0-SNAPSHOT"

application {
    mainClassName = "samples.hello.ApplicationKt"
}

springBoot {
    // Needs to add "Kt" word for recognizing Kotlin file...
    mainClassName = "samples.hello.ApplicationKt"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.springframework.boot:spring-boot-starter-web:2.5.6")
    implementation("org.springframework.boot:spring-boot-starter-aop:2.5.6")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")
    implementation("org.jetbrains.kotlin:kotlin-allopen")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:2.5.6")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.5.6")
    testImplementation("org.assertj:assertj-core:3.21.0")
    testImplementation("org.testng:testng:7.4.0")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
}

repositories {
    jcenter()
    mavenCentral()
}

tasks.test {
    useTestNG()
}
