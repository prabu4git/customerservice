FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY build/libs/customer-service-0.0.1-SNAPSHOT.jar customer-service.jar
ENTRYPOINT ["java", "-jar", "/customer-service.jar"]