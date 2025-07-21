# Stage 1: builder com Gradle pré-instalado
FROM gradle:8.4-jdk21-alpine AS builder

WORKDIR /home/gradle/project
COPY --chown=gradle:gradle . .

# Build sem testar (já testa no CI ou local)
RUN gradle clean build -x test --no-daemon

# Stage 2: runtime leve com JDK
FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copia só o jar do build
COPY --from=builder /home/gradle/project/build/libs/project-service-0.0.1-SNAPSHOT.jar .

EXPOSE 8081

CMD ["java", "-jar", "project-service-0.0.1-SNAPSHOT.jar"]
