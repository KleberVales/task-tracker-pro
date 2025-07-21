# Use official Java 21 image
FROM eclipse-temurin:21-jdk

# Set working directory inside the container
WORKDIR /app

# Copy everything from the current folder into the container
COPY . .

# Build the project with Gradle wrapper
RUN ./gradlew clean build

# Expose the port Spring Boot runs on
EXPOSE 8080

# Run the built JAR (adjust the name if needed)
CMD ["java", "-jar", "build/libs/auth-service-0.0.1-SNAPSHOT.jar"]
