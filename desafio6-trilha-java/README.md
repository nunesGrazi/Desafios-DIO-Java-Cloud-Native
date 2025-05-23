# 🧠 Projeto Lista de Tarefas com Spring Boot

Este é um projeto simples de API REST construído com **Spring Boot**, que permite **criar, listar, buscar e excluir tarefas**.

O foco principal é a **aplicação de princípios de design orientado a objetos** e **padrões de projeto (Design Patterns)** em Java, conforme proposto no desafio da DIO (Digital Innovation One).

---

## 🚀 Funcionalidades

- ✅ Criar tarefa
- 📋 Listar todas as tarefas
- 🔍 Buscar tarefa por ID
- ❌ Deletar tarefa

---

## 🧱 Estrutura do Projeto e Padrões Aplicados

### ✔️ **MVC (Model-View-Controller)**
Organização do projeto em:
- `Model`: representa a entidade `Tarefa`
- `Controller`: define os endpoints REST
- `Service`: contém a lógica de negócio
- `Repository`: lida com o banco de dados

### ✔️ **DAO (Data Access Object)**
Abstraído pelo Spring Data JPA via `@Repository`, facilita operações no banco sem expor a lógica da persistência.

### ✔️ **Singleton**
Os componentes anotados com `@Service`, `@Repository` e `@Controller` são Singletons por padrão, garantindo uma única instância de cada durante o ciclo de vida da aplicação.

### ✔️ **Inversão de Controle (IoC) e Injeção de Dependência (DI)**
Feita por meio da anotação `@Autowired` e injeção via construtor, desacoplando as dependências e facilitando testes e manutenção.

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (memória)
- Maven

---

## ▶️ Como Executar

1. Clone o projeto:
   ```bash
   git clone https://github.com/seu-usuario/projeto-tarefas.git
   
2. Execute a classe `ListaTarefasApplication.java`

3. Use o Postman ou qualquer cliente REST para acessar os endpoints:

    - `POST /tarefas` – Criar tarefa
    - `GET /tarefas` – Listar tarefas
    - `GET /tarefas/{id}` – Buscar tarefa por ID
    - `DELETE /tarefas/{id}` – Deletar tarefa


## 📚 Considerações Finais
Este projeto é uma introdução prática ao uso de padrões de projeto em Java dentro de uma aplicação Spring Boot. Ele mostra como aplicar boas práticas de arquitetura em APIs REST, e serve como base para projetos mais complexos que possam utilizar outros patterns como Factory, Strategy ou Observer.
