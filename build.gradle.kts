plugins {
    id("org.springframework.boot") version "2.7.5" // Оновлена версія Spring Boot
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.8.0" // Оновлена версія Kotlin
    kotlin("plugin.spring") version "1.8.0"
}

repositories {
    mavenCentral() // Оновлення репозиторіїв для підтримки нових версій
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.compileKotlin {
    kotlinOptions.jvmTarget = "17" // Встановлення правильного JVM target
}
springBoot {
    mainClass.set("com.dmarko.spring.Application")
}

tasks.bootRun {
    mainClass.set("com.dmarko.spring.Application")
}
