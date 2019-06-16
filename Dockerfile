FROM openjdk:8-jre-alpine

COPY ./target/SpringBootRestService-1.0.jar /app/app.jar

CMD ["java","-jar","/app/app.jar"]