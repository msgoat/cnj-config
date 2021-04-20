# cnj-config

Showcase of a "Hello-World" style cloud native Java using Spring Boot, Java EE and Eclipse MicroProfile as Java backend technologies demonstrating
cloud-native application configuration via environment variables.

The actual configuration approach is demonstrated with four different Java backend technologies:

* Java EE (see: [cnj-config-backend-javaee](cnj-config-backend-javaee/README.md))
* Eclipse MicroProfile (see: [cnj-config-backend-micro](cnj-config-backend-micro/README.md))
* Spring Boot + Spring Data (see: [cnj-config-backend-spring](cnj-config-backend-spring/README.md))
* Quarkus (see: [cnj-config-backend-quarkus](cnj-config-backend-quarkus/README.md))

## Status
![Build status](https://drone.cloudtrain.aws.msgoat.eu/api/badges/msgoat/cnj-config/status.svg)

## Release information

Latest version is: `3.0.0`.

A changelog can be found in [changelog.md](changelog.md).

## Build this showcase 

### Prerequisites

In order to run the build, you have to install the following tools locally:
* Docker
* Docker Compose 
* Maven
* Java JDK 11

### Run Maven

You can build all showcase applications by running Maven:
```
mvn clean install -P pre-commit-stage
```

The Maven build will create Docker images for all showcase applications and run system tests on them.