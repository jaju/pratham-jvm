plugins {
    java
}

val jar by tasks.getting(Jar::class) {
    manifest {
        attributes["Main-Class"] = "com.tavisca.workshops.prathm.RunRover"
    }
}

group = "com.tavisca.workshops"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.json:json:20180813")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.5.0")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.register<Test>("hidden-tests")

tasks.named<Test>("test") {
    dependsOn("cleanTest")
    useJUnitPlatform {
        includeEngines("junit-jupiter")
        excludeTags("hidden")
    }

    testLogging {
        showExceptions = true
        events("passed", "skipped", "failed")
    }
}

tasks.named<Test>("hidden-tests") {
    useJUnitPlatform {
        includeEngines("junit-jupiter")
        includeTags("hidden")
    }

    testLogging {
        showExceptions = true
        events("passed", "skipped", "failed")
    }
}