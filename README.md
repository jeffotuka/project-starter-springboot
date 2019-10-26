This is a template to start Spring Boot projects.

Make a copy of this project to start your own. Rename all references to "mycompany", "myproject", "Myproject". Feel free to remove any classes you know you won't use. And then, remember to change this text itself to yours!

## Running the project

#### From java command-line

The common method to run the project in servers or Docker containers.

```
mvn clean install
java -jar myproject-web/target/myproject-web.jar
```

#### From your IDE

Useful for developers.

* Run "MyprojectApplication" class in your IDE as a Java Application.

#### From Maven

```
mvn clean install
cd myproject-web
mvn spring-boot:run
```

## Building Docker image and sending to registry

SNAPSHOT version:

```
mvn clean install -Pdocker-build
```

Release version:

```
mvn clean install -Pdocker-build-release
```

## References
This project was originally based on this official Spring Boot guide - https://spring.io/guides/gs/rest-service/

