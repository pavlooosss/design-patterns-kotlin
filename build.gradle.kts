plugins {
    kotlin("jvm") version "1.6.21"
}

group = "me.pavelshvartsberg"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    testImplementation( kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}