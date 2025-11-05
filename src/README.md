# Library Management System (Java + Oracle Database)

A simple console-based Library Management System built using **Java**, **JDBC**, and **Oracle Database**.

## Features
- Add new books (ID, Title, Author)
- View all stored books
- Uses **JDBC** for Oracle Database connectivity
- Demonstrates **OOP**, **exception handling**, and **modular programming**

## Technologies Used
- Java
- JDBC
- Oracle Database (user: system / password: manager)


##  How to Run
1. Create a table in Oracle Database:
   ```sql
   CREATE TABLE books (
       id NUMBER PRIMARY KEY,
       title VARCHAR2(100),
       author VARCHAR2(100)
   );
