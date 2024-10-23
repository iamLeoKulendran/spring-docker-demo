FROM openjdk:22-jdk
WORKDIR /app
ADD target/spring-docker-demo.jar /spring-docker-demo.jar
ENTRYPOINT ["java", "-jar", "/spring-docker-demo.jar"]
EXPOSE 8080

