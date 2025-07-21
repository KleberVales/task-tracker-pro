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
