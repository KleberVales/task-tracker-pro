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

