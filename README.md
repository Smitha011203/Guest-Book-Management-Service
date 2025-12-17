# Guest Book Management Service

A Spring Boot RESTful web application for managing guest entries in a guest book system.
The application supports creating, viewing, updating, and deleting guest details using
a layered architecture and REST APIs.

## 🚀 Features
- Add a new guest
- View all guests
- Update guest details
- Delete a guest
- Swagger UI for API testing
- PostgreSQL database integration

## 🛠️ Tech Stack
- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Hibernate
- Swagger (OpenAPI)
- Maven

## 🧱 Project Architecture
- Controller Layer – Handles HTTP requests
- Service Layer – Business logic
- Repository Layer – Database access
- Entity Layer – Data models

## 🔗 API Endpoints
- POST `/guests` – Add guest
- GET `/guests` – View guests
- PUT `/guests/{id}` – Update guest
- DELETE `/guests/{id}` – Delete guest

## ▶️ How to Run
1. Clone the repository
2. Configure PostgreSQL in `application.properties`
3. Run the application
4. Access Swagger UI at:http://localhost:8080/swagger-ui/index.html#/
5. 
## 👩‍💻 Author
Smitha K V

