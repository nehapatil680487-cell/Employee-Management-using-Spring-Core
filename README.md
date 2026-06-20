# Employee Management System using Spring Core

##  Project Overview
The **Employee Management System using Spring Core** is a Java-based application designed to manage employee details such as personal information and address using the Spring IoC container. The project demonstrates **Dependency Injection (Constructor and Setter Injection)** and focuses on achieving **loose coupling between classes**.

---

##  Objective
The main objective of this project is to understand the fundamentals of **Spring Core Framework**, including bean creation, configuration, and dependency injection.

---

##  Technologies Used
- Java
- Spring Core Framework
- XML Configuration
- Eclipse / IntelliJ IDEA

---

##  Features
- Manage employee personal details (ID, Name, Salary, etc.)
- Manage employee address details (Street, City, etc.)
- Constructor Injection
- Setter Injection
- Spring IoC Container for object management
- Simple and clean backend structure

---

##  Project Structure
src/
└── com.sit.employee/
├── Employee.java
├── Address.java
└── MainApp.java

resources/
└── applicationContext.xml

## ⚙️ How It Works
1. Spring container reads `applicationContext.xml`
2. Beans (Employee, Address) are created by Spring IoC container
3. Dependencies are injected using constructor or setter injection
4. Application displays employee details

---

##  How to Run

### Compile Project
```cmd
javac -d . src/com/sit/employee/*.java

Learning Outcomes
Understanding Spring Core IoC container
Working with Dependency Injection
Bean configuration using XML
Achieving loose coupling in Java applications
