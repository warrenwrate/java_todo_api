FROM openjdk:8-jdk-alpine
ADD target/example-0.0.1-SNAPSHOT.jar basic-todo-api.jar
ENTRYPOINT ["sh","-c", "java -jar /basic-todo-api.jar"]
