# 📝 Lista de Tarefas - API RESTful com Spring Boot

Este projeto é uma API RESTful simples para gerenciamento de tarefas, desenvolvida com **Spring Boot 3**, **Java 17** e banco de dados (H2 local ou MySQL via Railway). A aplicação permite criar, listar, buscar e deletar tarefas.

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- H2 Database (ou MySQL via Railway)
- Maven

## 🧠 Padrões de Projeto (Design Patterns)

O projeto foi criado com foco no uso de **boas práticas de design**, como:

- **Interface-based design:** `TarefaService` define o contrato para operações sobre tarefas.
- **Inversão de dependência (DI):** uso de `@Service`, `@Autowired` para injetar dependências.
- **Separação de responsabilidades:** `Controller`, `Service`, `Entity` e `Repository` bem separados.
- **RESTful design:** cada operação da API corresponde a um endpoint semântico (`GET`, `POST`, `DELETE`, etc.).

## 📌 Endpoints disponíveis

| Método | Rota               | Descrição                  |
|--------|--------------------|----------------------------|
| GET    | /tarefas           | Lista todas as tarefas     |
| POST   | /tarefas           | Cria uma nova tarefa       |
| GET    | /tarefas/{id}      | Busca uma tarefa por ID    |
| DELETE | /tarefas/{id}      | Deleta uma tarefa por ID   |