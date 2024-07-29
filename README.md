Designed and implemented a backend for a daily-expenses sharing application. This 
application will allow users to add expenses and split them based on three 
different methods: exact amounts, percentages, and equal splits.


Technologies Used
Spring Boot: Framework for building Java-based applications.
Gradle: Build automation tool.
MySQL: Relational database management system.
Hibernate/JPA: Object-relational mapping framework.
Jackson: JSON processing library.
Logback: Logging framework
Lombok- Could have used to make the code simpler but didn't and made use of getter and setters 

API Endpoints:
User Endpoints:
✓ Create user.
✓ Retrieve user details.
 Expense Endpoints:
✓ Add expense.
✓ Retrieve individual user expenses.
✓ Retrieve overall expenses.
✓ Download balance sheet.
Data Validation:
✓ Validate user inputs.


Json objects which can be used with postman


{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "mobileNumber": "1234567890"
}


{
  "amount": 100.0,
  "splitType": "equal",
  "participantIds": [1, 2, 3]
}


{
  "amount": 100.0,
  "splitType": "percentage",
  "participantIds": [1, 2, 3],
  "percentages": {
    "1": 50.0,
    "2": 30.0,
    "3": 20.0
  }
}



Java Development Kit (JDK): Ensure you have JDK 8 or later installed.
Gradle: Make sure Gradle is installed on your system.
MySQL: Install MySQL server and create a database named convin_db.
Git: Install Git to clone the project repository


Create a database convin_db
make sure to change username and properties in application.properties 


