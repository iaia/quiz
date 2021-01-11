import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.21"
}

group = "bot.iaiabot"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(project(":common"))
    implementation(project(":entity"))
    implementation(project(":repository"))
    testImplementation(project(":testmodule"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
