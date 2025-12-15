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

---

## 🚀 Tech Stack

This project was developed using the following technologies and tools:

* **Backend:** Java 21, Spring Boot, Spring Data JPA, Spring Security
* **Database:** PostgreSQL (core data), MongoDB (audit/logs)
* **Architecture:** Microservices, REST API, JWT Auth, API Gateway
* **DevOps:** Docker, Docker Compose, GitHub Actions (CI/CD)
* **Monitoring:** Prometheus, Grafana
* **Logging:** ELK Stack (Elasticsearch, Logstash, Kibana)

---

## 📂 Project Structure

The repository is organized to facilitate navigation and development of the microservices, with each service residing in its own directory.

```
├── auth-service/
├── project-service/
├── task-service/
├── notification-service/ (optional)
├── api-gateway/
└── docker-compose.yml
└── ... (other configuration files)

```

---

## ✅ Completed Project Stages

To date, the following stages of the TaskTrackerPro project have been completed:

1.  **Repository Creation and Initial Setup:**
    * Public repository `task-tracker-pro` created on GitHub.
    * Project initialized with Gradle and Spring Boot (version 3.5.3).
    * `.gitignore` file configured for multiple IDEs (IntelliJ, Eclipse, VS Code, NetBeans).
2.  **Java Environment and Gradle Configuration.**
3.  **Tests and Database for Development Environment:**
    * Added H2 in-memory for unit testing.
    * Created `application.properties` in `src/test/resources` to configure H2.
    * Fixed an error in `contextLoads()` of the `AuthServiceApplicationTests` class.
    * Successfully ran `./gradlew clean test` ✅.
4.  **Folder Structure and Modularization** (specify if there's anything noteworthy).
5.  **Version Management with Git:**
    * Initiated semantic commit practices following conventions (e.g., `feat: initialize Auth Service with Spring Boot`).
    * Learned how to create commit messages that accurately reflect the action performed in the code.
  
---

## 🚀 How to Run The Project (Locally)

To set up and run TaskTrackerPro on your local machine, follow these steps:

1.  **Prerequisites:**
    * Java 21 JDK
    * Docker and Docker Compose
    * Gradle
    * Your preferred IDE (IntelliJ IDEA recommended)
2.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/KleberVales/task-tracker-pro.git](https://github.com/KleberVales/task-tracker-pro.git)
    cd task-tracker-pro
    ```
3.  **Configure Environment Variables:**
    * Create a `.env` file in the project root (or within each microservice's directory, if applicable) with database configurations and other sensitive variables. (e.g., `DATABASE_URL=jdbc:postgresql://localhost:5432/tasktracker_db`).
4.  **Build the Microservices:**
    ```bash
    ./gradlew clean build
    ```
5.  **Start Services with Docker Compose:**
    ```bash
    docker-compose up --build
    ```
    This will build the Docker images (if needed) and start all services (PostgreSQL, MongoDB, microservices, etc.).
6.  **Access the API:**
    * Once all services are running, the API will be accessible via the `api-gateway`. (e.g., `http://localhost:8080/api/v1/auth/register`).

*For more details on configuring and using each microservice, refer to their respective directories.*

---

## 👋 How to Contribute

Contributions are highly welcome! If you have ideas, improvements, or find bugs, please:

1.  Fork the repository.
2.  Create a new branch (`git checkout -b feature/your-feature`).
3.  Make your changes and commit them (`git commit -m 'feat: add new feature X'`).
4.  Push your changes (`git push origin feature/your-feature`).
5.  Open a Pull Request detailing your modifications.

---

## ✉️ Contact

Connect with me!  [LinkedIn](https://www.linkedin.com/in/seu-perfil-linkedin) | [GitHub](https://github.com/KleberVales) |

**Kleber Vales**

*Java & Spring Software Engineer*

Cloud | DevOps | Git/GitHub | Scrum | JUnit 5 | Hibernate

🏆 Oracle Certified Associate - Java SE 7 Programmer

🏆 Microsoft Technology Associate - Software Development Fundamentals

🏆 Scrum Fundamentals Certified (SFC™)

🏆 Oracle Clould Infrastructure 2025 - DevOps Professional

🏆 Oracle Cloud Infrastructure 2025 - Generative AI Professional

🎓 **Bachelor's Degree in Computer Science**

🎓 MBA in Web Software Development

