import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    kotlin("jvm")
    java
}

val javaVersion = property("javaVersion") as String

kotlin {
    jvmToolchain(25)  // Java 25 사용

    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_24)  // JVM 타겟 24
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_24
    targetCompatibility = JavaVersion.VERSION_24
}
