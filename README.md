# UserManagementSystem
User Management System is a CRUD application using Spring Boot, AngularJS, Spring Data, JPA/Hibernate and MySQL.

# To Run the Application

# Technolgies Requirement:
Spring Boot 1.4.3.RELEASE
Spring 4.3.5.RELEASE [transitively]
Spring data JPA 1.10.6.RELEASE [transitively]
Hibernate 5.0.11.Final [transitively]
MySQL 5.1.40 [transitively]
Hikari CP 2.4.7 [transitively]
AngularJS 1.5.8
Maven 3.1
JDK 1.8
Eclipse Neon/Mars 

# How to Run:

1. Clone the project from github.
2. Import the project in Eclipse via File->import->Maven->Existing Maven project-> # give project location and name.
3.Via Eclipse::create a Run configuration for you main class, specifying the profile. To do that from toolbar, select Run->Run Configurations->Arguments->VM Arguments. Add -Dspring.profiles.active=local or -Dspring.profiles.active=prod]

Run it directly, in that case default profile will be used. In case you want a different profile to be used, follow the step 3 and also update application.yml

# How to start application on Browser
Steps:

1.Open browser and navigate to http://localhost:8080/Application/

2.Try To Add Few Users

3.Try to add a user with same name as an existing user, should get an error [this is backend throwing the error, you can change the logic on backend based on your business rules].

4.Reset the form.Remove a user, edit the other one.

5.To Start the app in PROD :
reate a Run configuration for you main class, specifying the profile. To do that from toolbar, select Run->Run Configurations->Arguments->VM Arguments. 
Add -
-Dspring.profiles.active=prod


