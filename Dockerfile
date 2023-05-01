FROM openjdk:8-jdk-alpine
EXPOSE 8080
COPY target/sample-poc-0.0.1-SNAPSHOT.jar sample-poc-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/sample-poc-0.0.1-SNAPSHOT.jar"]