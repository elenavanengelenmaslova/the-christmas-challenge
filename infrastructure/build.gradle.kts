
plugins {
    application
}

dependencies {
    implementation("software.amazon.awscdk:aws-cdk-lib:2.55.1")
    implementation("software.constructs:constructs:10.1.194")
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
