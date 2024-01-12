plugins {
    kotlin("jvm") version "1.9.21"

    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
//    jcenter()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}



application {
    mainClass= "org.example.belajar.AppKt"
}

tasks.register("author"){

}





