# TaskTrackerPro 🧩

**Sua Plataforma Modular de Gerenciamento de Tarefas e Projetos para o Mundo Cloud-Native.**

---

## 💡 Sobre o Projeto

O TaskTrackerPro é uma plataforma robusta e escalável para **gerenciamento de tarefas e projetos**, desenvolvida com uma **arquitetura de microserviços** utilizando **Java 21 e Spring Boot**. Projetado para o ambiente **cloud-native**, ele oferece uma solução flexível e de alta performance para equipes e indivíduos que buscam eficiência na organização e acompanhamento de suas atividades. Este projeto visa demonstrar boas práticas de desenvolvimento de software, desde a concepção de microserviços até a automação de CI/CD e monitoramento.

---

## ✨ Funcionalidades

* **Autenticação e Autorização Segura:** Gerenciamento de usuários, login e proteção de rotas com JWT.
* **Gestão Abrangente de Projetos:** Criação, edição, exclusão de projetos e atribuição de usuários.
* **Controle Detalhado de Tarefas:** Adição, atualização de status, comentários e organização de tarefas.
* **Notificações (Opcional):** Sistema de alerta integrado para e-mail ou Slack (em desenvolvimento/futuro).
* **API RESTful:** Comunicação clara e padronizada entre os serviços.
* **Gateway de API:** Roteamento inteligente de requisições e descoberta de serviços.

---

## 🧱 Visão Geral da Arquitetura de Microserviços

O TaskTrackerPro é construído sobre uma arquitetura de microserviços, garantindo **escalabilidade, resiliência e facilidade de manutenção**. Cada serviço é autônomo e focado em uma responsabilidade específica, comunicando-se através de APIs RESTful.

| Service            | Descrição                                         |
| :----------------- | :------------------------------------------------ |
| `auth-service`     | Gerencia registro de usuários, login e autenticação JWT. |
| `project-service`  | Cuida do CRUD de projetos e atribuição de usuários. |
| `task-service`     | Lida com o CRUD de tarefas, atualizações de status e comentários. |
| `notification-service` | **[Opcional/Futuro]** Envia alertas via e-mail ou Slack. |
| `api-gateway`      | Roteia requisições e gerencia a descoberta de serviços. |

---

## 🚀 Tecnologias Utilizadas

Este projeto foi desenvolvido utilizando as seguintes tecnologias e ferramentas:

* **Backend:** Java 21, Spring Boot, Spring Data JPA, Spring Security
* **Banco de Dados:** PostgreSQL (dados principais), MongoDB (auditoria/logs)
* **Arquitetura:** Microservices, REST API, JWT Auth, API Gateway
* **DevOps:** Docker, Docker Compose, GitHub Actions (CI/CD)
* **Monitoramento:** Prometheus, Grafana
* **Logging:** ELK Stack (Elasticsearch, Logstash, Kibana)

---

## 📂 Estrutura do Projeto

O repositório é organizado para facilitar a navegação e o desenvolvimento dos microserviços, com cada serviço residindo em seu próprio diretório.

```
├── auth-service/
├── project-service/
├── task-service/
├── notification-service/ (opcional)
├── api-gateway/
└── docker-compose.yml
└── ... (outros arquivos de configuração)

```

---

## ✅ Etapas Concluídas

Até o momento, as seguintes etapas do projeto TaskTrackerPro foram finalizadas:

1.  **Criação do Repositório e Configuração Inicial:**
    * Repositório público `task-tracker-pro` criado no GitHub.
    * Projeto inicializado com Gradle e Spring Boot (versão 3.5.3).
    * Arquivo `.gitignore` configurado para múltiplas IDEs (IntelliJ, Eclipse, VS Code, NetBeans).
2.  **Configuração do Ambiente Java e Gradle.**
3.  **Testes e Banco de Dados para Ambiente de Desenvolvimento:**
    * Adição do H2 em memória para testes unitários.
    * Criação de `application.properties` em `src/test/resources` para configurar o H2.
    * Correção de erro em `contextLoads()` da classe `AuthServiceApplicationTests`.
    * Execução bem-sucedida de `./gradlew clean test` ✅.
4.  **Estrutura de Pastas e Modularização** (especificar se houver algo notável).
5.  **Gerenciamento de Versão com Git:**
    * Iniciada a prática de commits semânticos seguindo convenções (ex: `feat: initialize Auth Service with Spring Boot`).
    * Aprendizado sobre a criação de mensagens de commit que refletem com precisão a ação realizada no código.
