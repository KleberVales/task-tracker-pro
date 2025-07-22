# TaskTrackerPro 🧩

**Your Modular Task and Project Management Platform Built for the Cloud-Native World.**

---

## 💡 About The Project

TaskTrackerPro is a robust and scalable **task and project management platform**, meticulously developed with a **microservices architecture** leveraging **Java 21 and Spring Boot**. Designed with **cloud-native principles** in mind, it offers a flexible and high-performance solution for teams and individuals seeking efficiency in organizing and tracking their activities. This project serves as a showcase for best software development practices, from microservices conception to automated CI/CD and monitoring.

---

## ✨ Key Features

* **Secure Authentication & Authorization:** User management, login, and JWT-based route protection.
* **Comprehensive Project Management:** Creation, editing, deletion of projects, and user assignment.
* **Detailed Task Control:** Adding, updating status, comments, and organizing tasks.
* **Notifications (Optional):** Integrated alerting system for email or Slack (under development/future).
* **RESTful API:** Clear and standardized communication between services.
* **API Gateway:** Intelligent request routing and service discovery.

---

## 🧱 Microservices Architecture Overview

TaskTrackerPro is built on a microservices architecture, ensuring **scalability, resilience, and ease of maintenance**. Each service is autonomous and focused on a specific responsibility, communicating via RESTful APIs.

| Service            | Description                                         |
| :----------------- | :------------------------------------------------ |
| `auth-service`     | Handles user registration, login, and JWT authentication. |
| `project-service`  | Manages project CRUD and user assignment.           |
| `task-service`     | Handles task CRUD, status updates, and comments.    |
| `notification-service` | **[Optional/Future]** Sends alerts via email or Slack. |
| `api-gateway`      | Routes requests and handles service discovery.      |
