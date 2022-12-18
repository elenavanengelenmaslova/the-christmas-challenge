
plugins {
    application
}

dependencies {
    implementation("software.amazon.awscdk:aws-cdk-lib:2.54.0")
    implementation("software.constructs:constructs:10.1.187")
}

application {
    mainClass.set("nl.vintik.workshop.aws.infra.InfrastructureAppKt")
}

tasks.named("run") {
    dependsOn(":reindeer:packageDistribution")
}
repositories {
    mavenCentral()
}
