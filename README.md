# Spring Boot DSA Tracker

This is a simple Spring Boot project that I built to practice REST APIs, Spring Data JPA, and MySQL.

The application allows users to manage DSA (Data Structures and Algorithms) questions by performing CRUD operations.

## Features

* Add a new question
* View all questions
* View a question by ID
* Update question details
* Delete a question

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven

## API Endpoints

| Method | Endpoint        | Description        |
| ------ | --------------- | ------------------ |
| GET    | /questions      | Get all questions  |
| GET    | /questions/{id} | Get question by ID |
| POST   | /questions      | Add a new question |
| PUT    | /questions/{id} | Update a question  |
| DELETE | /questions/{id} | Delete a question  |

## Learning Outcomes

While building this project, I practiced:

* Creating REST APIs using Spring Boot
* Using JPA Repositories
* Connecting Spring Boot with MySQL
* Implementing CRUD operations
* Working with Service and Controller layers
* Using Git and GitHub for version control

## Future Improvements

* Filter questions by topic
* Filter questions by difficulty
* Add authentication using Spring Security and JWT
* Improve exception handling

## Author

Rabin Mallick
Built as a learning project while exploring Spring Boot, REST APIs, and MySQL.
