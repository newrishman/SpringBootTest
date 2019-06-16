New Spring Boot lessons


# Docker

Build project:

```bash
mvn package
```

Build docker image:

```bash
docker build -t spring-boot-test .
```

Run docker image:

```bash
docker run -it -p8080:8080 spring-boot-test
```