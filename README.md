<center>
<h1> USER MANAGEMENT SYSTEM </h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>
This project is based on User management system that is built with the help of Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The user data model is defined in the User class, which has the following attributes:
```
UserId : unique identifier for each user
Name : name of the user
UserName : Organisation user name
Address : address of the user
Phone Number : Phone number of the user
Date & Time : Date and Time of the user
```

---

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the proper controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## Functions used :-

### API Endpoints :-
</br>
<b> Add User </b>

* PostMapping: /addUser
```
This endpoint makes a call to method in userService class which is connected to database. In database we add a new user given through API.
```

* GetMapping: /getAllUser
```
This endpoint makes a call to method in userService class which retrieves data of all users from database. This data is sent to controller which is then sent through the API to client.
```

* GetMapping: "getUser/{userid}"
```
This endpoint returns data of specific user based on userid through API
```

* PutMapping
```
This endpoint makes a call to method in userService class which is connected to database. In database we update a user by userid given through API.
```

* DeleteMapping
```
This endpoint makes a call to method in userService class which is connected to database. In database we delete a user by userid given through API.
```

---

## Data structure Used
* ArrayList
```
We have used ArrayList data structure as a database to implement CRUD Operations 
```
---

## Project Summary

The User Management System is a Spring Boot project using Java as a language to enables basic functionality for managing users.The project is built with the help of Spring Boot Framework for building production-rady applications and this project also use ArrayList as the data structure to store and manage user data. 

The following project consist of four class i.e; the UserManagementController, the UserService, the UserDao, and the User class.
