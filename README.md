# product-service

A RESTful product microservice built with Spring Boot.

## Description

This project is a simple enterprise-style REST API that manages products.
It demonstrates layered architecture using Controller, Service, and Repository layers.

Technologies used:

* Java
* Spring Boot
* Spring Data JPA
* H2 Database
* Maven

## Getting Started

Run the project locally:

```
mvn spring-boot:run
```

The server starts on:

```
http://localhost:8080
```

## API Endpoints

| Method | Endpoint       | Description          |
| ------ | -------------- | -------------------- |
| GET    | /products      | Get all products     |
| GET    | /products/{id} | Get product by id    |
| POST   | /products      | Create new product   |
| GET    | /health        | Service health check |

## Example Request

POST /products

```json
{
 "name": "Webcam",
 "price": 99.99
}
```

## Example Response

```json
{
 "id": 4,
 "name": "Webcam",
 "price": 99.99
}
```
## Reflection

### 1. Purpose of the Service Layer

The service layer contains the business logic of the application. It acts as a bridge between the controller and the repository. Controllers should not directly access repositories because it breaks separation of concerns and makes the application harder to maintain and test.

### 2. Why Enterprise Systems Use Layered Architecture

Layered architecture separates responsibilities into different layers such as controller, service, and repository. This improves maintainability, readability, scalability, and makes the code easier to test compared to putting everything in a single class.

### 3. Advantages of Spring Data JPA

Spring Data JPA simplifies database operations by automatically generating repository implementations. It reduces boilerplate code and allows developers to perform CRUD operations without writing SQL queries manually.

### 4. Why Use Mocks in Unit Tests

Mocks allow the class under test to run independently of its dependencies. This isolates the logic being tested and ensures that failures are caused only by the code under test and not by external systems such as databases.

### 5. ddl-auto update vs create-drop

`create-drop` recreates the database schema every time the application starts and deletes it when the application stops. It is useful for development and testing. `update` updates the schema without deleting existing data and is typically used when data persistence is required.
