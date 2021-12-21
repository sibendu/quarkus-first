# quarkus-first Project

This project uses Quarkus.

## Running the application in dev mode

Run in dev mode with live coding:
```shell script
./gradlew clean build quarkusDev
```
> **_NOTE:_**  Quarkus Dev UI http://localhost:8080/q/dev/.

## Packaging and running the application

```shell script
./gradlew build
```
=> Produces the `quarkus-run.jar` file in the `build/quarkus-app/` directory.

Note: it’s not an _über-jar_ as the dependencies are copied into the `build/quarkus-app/lib/` directory.

The application is now runnable using `java -jar build/quarkus-app/quarkus-run.jar`.

To build an _über-jar_, execute the following command:
```shell script
./gradlew build -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar build/*-runner.jar`.

## Creating a native executable

To create a native executable: 
```shell script
./gradlew build -Dquarkus.package.type=native
```

Or, if GraalVM NOT installed, to run the native executable build in a container using: 
```shell script
./gradlew build -Dquarkus.package.type=native -Dquarkus.native.container-build=true
```

Then execute your native executable with: `./build/quarkus-first-1.0.0-SNAPSHOT-runner`