# The Christmas Challenge!
Kotlin + AWS serverless workshop

## Architecture

In this workshop we are going to build a simple event driven application that processes events on event bridge with AWS Lambda; saves the result in DynamoDB NoSQL database; and exposes the data via GraphQL through AWS AppSync:

![event-app](instructions/images/EventApp.png)

At the end of the workshop you should have an understanding of how to build, configure and deploy an AWS serverless application in Kotlin using CDK in Kotlin.

## Instructions

1. [Prerequisites](instructions/1-prerequisites.adoc)
2. [Generate and configure workshop project](instructions/2-generate-workshop-project.adoc)
3. [Add event bus on AWS EventBridge](instructions/3-add-event-bus.adoc)
4. [Add DynamoDB](instructions/4-add-dynamoDB.adoc)
5. [Add AppSync](instructions/5-add-app-sync.adoc)
6. [Clean up resources](instructions/6-clean-up.adoc)
