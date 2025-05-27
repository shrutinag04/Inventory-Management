# Inventory-Management

This is a simple Spring Boot REST API for managing items in an inventory. It allows you to perform basic CRUD (Create, Read, Update, Delete) operations on `Item` entities using a relational database (like MySQL).

---

## Features

- Create a new item  - POST- http://localhost:<port>/items   
- Retrieve a list of all items - GET- http://localhost:<port>/items ---provide raw Json of item
- Delete an item by ID - DELETE - http://localhost:<port>/items/<id>
- You can try using swagger for this : http://localhost:<port>/swagger-ui/index.html

---

##  Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

---

## Setup

- Download and open project in intelliJ or similar editor. Make sure you have Maven,JDK 17 and mySQL workbench.
- Create user in workbench. create Database "Project". Provide details-Username,Password to application.properties.
- start postman try out API and its responses.
- swagger url:http://localhost:<port>/swagger-ui/index.html

