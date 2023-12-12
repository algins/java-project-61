plugins {
    id("application")
    id("java")
    id("com.github.ben-manes.versions") version "0.41.0"
}

application {
    mainClass.set("hexlet.code.App")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.2"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
}

tasks.test {
    useJUnitPlatform()
}

tasks.compileJava {
    options.release = 20
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}