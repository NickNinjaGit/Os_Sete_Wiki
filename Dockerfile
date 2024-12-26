FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY /target/osSete-0.0.1-SNAPSHOT.jar osSete.jar
ENTRYPOINT ["java","-jar","/osSete.jar"]