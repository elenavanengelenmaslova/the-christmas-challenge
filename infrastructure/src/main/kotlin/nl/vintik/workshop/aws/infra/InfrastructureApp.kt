package nl.vintik.workshop.aws.infra

import software.amazon.awscdk.App
import software.amazon.awscdk.Environment
import software.amazon.awscdk.StackProps

fun main() {
    val app = App()

    val environment = Environment.builder()
        .account(System.getenv("DEPLOY_TARGET_ACCOUNT"))
        .region(System.getenv("DEPLOY_TARGET_REGION"))
        .build()

    val stackId = "christmas-stack"
    InfrastructureChristmasStack(
        app, stackId,
        StackProps.builder()
            .env(environment)
            .description("Christmas stack with Kotlin JVM AWS Lambda")
            .build()
    )

    app.synth()
}
