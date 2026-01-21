# Library-ApiRest

📚 Library Management API
A robust, enterprise-grade RESTful API built with Spring Boot 3. This project demonstrates a highly decoupled architecture focused on scalability, maintainability, and clean code principles.

🚀 Key Features
Full CRUD Operations for Books, Authors, Editorials, and Categories.

Complex Relationships: Managed Many-to-One and Many-to-Many entity mappings.

Global Exception Handling: Centralized management of API errors.

Data Validation: Integrity checks at the DTO level.

Dynamic Search: Advanced filtering for authors and titles.

🏗️ Architecture & Design Patterns
The project is modeled using a 6-Layer Architecture to ensure strict separation of concerns:

Entities Layer: Core business models (JPA/Hibernate).

Repositories Layer: Data Access Objects (DAO) using Spring Data JPA.

Mappers Layer: Object-to-object mapping using MapStruct to keep Entities and DTOs decoupled.

DTOs Layer (Data Transfer Objects): Optimized objects for API requests and responses.

Service Layer: Business logic implementation with generic base classes.

Controller Layer: REST Endpoints exposing resources to the client.
