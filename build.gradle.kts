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

    testImplementation( kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}