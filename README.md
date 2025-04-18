# Spring Boot Course Management Application

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [Usage](#usage)
- [License](#license)

## Introduction
This project is a Spring Boot application designed to manage courses. It builds upon foundational work done in Part A of the assignment and implements additional features such as CRUD operations for course management and input validation using Spring Validation or Bean Validation (JSR-303/JSR-380).

This project is a group assignment, and collaboration among group members is essential. Please ensure that all group members and the lecturer have access to this repository.

## Features
1. **Course Management**:
   - Create, Read, Update, and Delete (CRUD) operations for course entities.
2. **Validation**:
   - Input validation to ensure data integrity and prevent errors using annotations like `@Valid` and `@NotNull`.

## Project Structure
```
.idea/
src/
  main/java/com/example/demo/
    controllers/
      CourseController.java
      HomeController.java
    handlers/
      GlobalExceptionHandler.java
    model/
      Course.java
      Main.java
    resources/
      application.properties
target/
  classes/com/example/demo/
    controller/
      CourseController.class
      HomeController.class
    handlers/
      GlobalExceptionHandler.class
    model/
      Course.class
      Main.class
.gitignore
pom.xml
README.md
```

## Technologies Used
- **Java**: Programming language.
- **Spring Boot**: Framework for building the application.
- **Maven**: Dependency management and build tool.
- **H2 Database**: In-memory database for development and testing (if applicable).
- **Spring Validation**: For validating input data.

## Setup Instructions
1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   cd your-repo-name
   ```

2. **Import the project into your IDE**:
   - Open IntelliJ IDEA or another IDE of your choice.
   - Import the project as a Maven project.

3. **Run the application**:
   - Locate the `Main.java` file in the `com.example.demo` package.
   - Run the `Main.java` file to start the Spring Boot application.

4. **Access the application**:
   - Once the application is running, access it at `http://localhost:8080` in your web browser.

## Usage
- Use the endpoints for managing course data. Example endpoints include:
  - `POST /courses`: Create a new course.
  - `GET /courses`: Retrieve a list of courses.
  - `PUT /courses/{id}`: Update an existing course.
  - `DELETE /courses/{id}`: Delete a course.
- Ensure that input data meets validation requirements to avoid errors.

## Collaboration
This is a group project. To facilitate collaboration:
- Add all group members and the lecturer as collaborators to this GitHub repository.
- Use GitHub issues to track tasks and bugs.
- Follow Git branching strategies for development.

## License
This project is for educational purposes only and does not have a specific license.

