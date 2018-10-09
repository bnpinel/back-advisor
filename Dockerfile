FROM openjdk:8-jdk-alpine

COPY target/back-advisor-0.0.1-SNAPSHOT.jar /data/back-advisor-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "/data/back-advisor-0.0.1-SNAPSHOT.jar"]