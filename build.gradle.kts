import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.21"
    id("io.gitlab.arturbosch.detekt") version "1.15.0"
}

group = "com.github.osipxd"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

// 1. Enable explicit api mode
kotlin {
    explicitApi()
}

// 2. Enable RedundantVisibilityModifierRule in detekt.yml
detekt {
    config.setFrom(file("detekt.yml"))
    buildUponDefaultConfig = true
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
