# TaskTrackerPro 🧩  
A modular task and project management platform built with Java 21, Spring Boot, and Docker. Designed with microservices architecture and cloud-native deployment in mind.

## 🚀 Tech Stack

- **Backend:** Java 21, Spring Boot, Spring Data JPA, Spring Security  
- **Database:** PostgreSQL (core) + MongoDB (audit)  
- **Architecture:** Microservices, REST API, JWT Auth, API Gateway  
- **DevOps:** Docker, Docker Compose, GitHub Actions, CI/CD  
- **Monitoring:** Prometheus + Grafana  
- **Logging:** ELK Stack (Elasticsearch, Logstash, Kibana)

## 🧱 Microservices Overview

| Service         | Description                       |
|-----------------|-----------------------------------|
| `auth-service`  | Handles user registration, login, and JWT authentication  
| `project-service` | Manages project CRUD and user assignment  
| `task-service`  | Handles task CRUD, status updates, and comments  
| `notification-service` | Optional: Sends alerts via email or Slack  
| `api-gateway`   | Routes requests and handles service discovery  

## 📂 Project Structure

## ✅ Etapas Concluídas do Projeto task-tracker-pro

1. Repository Creation and Initial Setup
   - Created the public repository on GitHub: task-tracker-pro
   - Initialized the project with Gradle and Spring Boot (version 3.5.3)
   - Configured .gitignore across multiple IDEs (IntelliJ, Eclipse, VS Code, NetBeans)
     
2. Java Environment and Gradle Configuration3
  
     
3. Tests and Database for the Development Environment
    - Added H2 in memory for unit testing
   - Created application.properties in src/test/resources to configure H2
   - Fixed an error in contextLoads() of the AuthServiceApplicationTests class
   - Run ./gradlew clean test successfully ✅
     
4. Folder Structure and Modularization
   
5. Version Management with Git
   - Initiated semantic commits following convention (e.g., feat: initialize Auth Service with Spring Boot)
   - Learned how to create messages that accurately reflect the action performed in the code

---

**Kleber Vales**  

*Software Developer*  
Java | Spring Framework | Cloud & DevOps | Git & GitHub | Scrum | JUnit | Hibernate  

Bachelor's Degree in Computer Science  
MBA in Web Software Development (Current)

