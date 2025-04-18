# Spring Assignment 1 - Part A

## Overview
This project is part of **Spring Assignment 1**, implemented entirely in Java. It demonstrates foundational concepts of Spring Boot and includes functionalities such as RESTful APIs and course management.

## Features
- **RESTful API**: Provides endpoints for managing courses.
- **Spring Boot Framework**: Utilizes Spring Boot to set up a lightweight, production-ready application.
- **Course Management**:
  - Foundation Courses
  - Undergraduate Courses
  - Honours Courses

## Prerequisites
Before running this project, ensure you have the following installed:
- Java Development Kit (JDK 17 or newer).
- Maven (for dependency management and building the project).
- An IDE such as IntelliJ IDEA or Eclipse (optional but recommended).

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/vethenzukiso/SpringAssignment1.git
   ```
2. Navigate to the project directory:
   ```bash
   cd SpringAssignment1
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

## Running the Application
1. Start the application:
   ```bash
   mvn spring-boot:run
   ```
2. Access the API:
   - Base URL: `http://localhost:8080`
   - Example endpoint: `GET /computer-science/courses`

## API Documentation
### Endpoints
#### `GET /computer-science/courses`
- **Description**: Retrieves a list of available courses.
- **Response**:
  ```json
  {
    "Foundation Courses": "2 courses offered",
    "Undergraduate Courses": "5 courses offered",
    "Honours Courses": "4 courses offered"
  }
  ```

## Project Structure
```
src/
├── main/
│   ├── java/
│   │   ├── Main.java
│   │   └── SpringBoot/
│   │       └── SpringBootClass.java
├── .idea/
│   ├── misc.xml
│   └── modules.xml
```

## Contributing
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch with your feature or bug fix.
3. Submit a pull request with a clear description of your changes.

