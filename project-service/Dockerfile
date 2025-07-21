FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN ./gradlew clean build -x test

EXPOSE 8081

CMD ["java", "-jar", "build/libs/project-service-0.0.1-SNAPSHOT.jar"]
