# Resource Allocation System

The Resource Allocation System is a web-based application built using Spring Boot and MongoDB. It provides a platform for managing employees, projects, and their allocation. The system allows efficient allocation of resources based on project requirements and employee availability. This README file provides information on setting up and using the Resource Allocation System.

## Features

- Employee management: Add, update, and delete employee information.
- Project management: Create, edit, and remove project details.
- Resource allocation: Assign employees to projects based on availability and project requirements.
- REST API: Expose endpoints for interacting with the system using RESTful principles.
- Postman collection: Use the provided Postman collection to test the API endpoints.

## Technologies Used

- Spring Boot: A Java framework for building robust and scalable applications.
- MongoDB: A NoSQL document-oriented database for storing data.
- REST API: Use HTTP methods and JSON payloads to interact with the system.
- Postman: A popular API development and testing tool.

## Prerequisites

Before setting up the Resource Allocation System, ensure that you have the following installed:

- Java Development Kit (JDK) version 11 or higher
- Maven
- MongoDB

## Getting Started

1. Clone the repository:

```
git clone <repository_url>
```

2. Navigate to the project directory:

```
cd resource-allocation-system
```

3. Build the project using Maven:

```
mvn clean install
```

4. Start MongoDB on your local machine.

5. Run the application:

```
mvn spring-boot:run
```

The application will start running on `http://localhost:8080`.

## API Endpoints

The Resource Allocation System exposes the following REST API endpoints:

### Employees

- `GET /employees`: Retrieve all employees.
- `GET /employees/{id}`: Retrieve a specific employee by ID.
- `POST /employees`: Create a new employee.
- `PUT /employees/{id}`: Update an existing employee.
- `DELETE /employees/{id}`: Delete an employee.

### Projects

- `GET /projects`: Retrieve all projects.
- `GET /projects/{id}`: Retrieve a specific project by ID.
- `POST /projects`: Create a new project.
- `PUT /projects/{id}`: Update an existing project.
- `DELETE /projects/{id}`: Delete a project.

### Resource Allocation

- `GET /allocation`: Retrieve all resource allocations.
- `GET /allocation/{id}`: Retrieve a specific resource allocation by ID.
- `POST /allocation`: Create a new resource allocation.
- `PUT /allocation/{id}`: Update an existing resource allocation.
- `DELETE /allocation/{id}`: Delete a resource allocation.

## Postman Collection

To interact with the Resource Allocation System using Postman:

1. Open Postman and import the provided collection file (`ResourceAllocationSystem.postman_collection.json`).
2. The collection contains pre-defined requests for each API endpoint. Modify them as needed.
3. Set the base URL to `http://localhost:8080`.
4. Send the requests to test the system and observe the responses.

## Conclusion

The Resource Allocation System provides an efficient solution for managing employee information, project details, and resource allocation. By utilizing Spring Boot and MongoDB, the system ensures a robust and scalable platform for resource allocation management. The provided REST API and Postman collection enable easy integration and testing.
