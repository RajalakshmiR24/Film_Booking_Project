# Spring Boot Film Booking Project
This is a sample repository for a Film Booking project built using Spring Boot, Hibernate, MySQL, JSP, and Thymeleaf. The project aims to provide a simple and intuitive web application for booking film tickets.

# Features
- User Registration: Users can create an account and log in to the system.
- Film Listing: Users can browse through a list of available films.
- Film Details: Users can view detailed information about a film, including its synopsis, duration, and rating.
- Booking: Users can select a film, choose a showtime, and book tickets.
- Seat Selection: Users can select their preferred seats from the available options.
- Payment: Users can make payments for their bookings using a secure payment gateway.
- Booking History: Users can view their past bookings and ticket details.
# Technologies Used
- Spring Boot: A Java-based framework for building web applications.
- Hibernate: An ORM (Object-Relational Mapping) framework for mapping Java objects to database tables.
- MySQL: A popular open-source relational database management system.
- JSP (JavaServer Pages): A technology for creating dynamic web pages using Java.
- Thymeleaf: A modern server-side Java template engine for web and standalone environments.
# Prerequisites
- Java Development Kit (JDK) 8 or higher
- Apache Maven
- MySQL Server
- Integrated Development Environment (IDE) of your choice (e.g., IntelliJ IDEA, Eclipse, Spring Tool Suite 4)
# Getting Started
1. Clone the repository:
   ```shell
   git clone https://github.com/RajalakshmiR24/Film_Booking_Project.git
2. Open the project in your preferred IDE.

3. Configure the MySQL database connection in the application.properties file. Update the spring. data source.url, spring.datasource.username, and spring. data source.password properties with your database details.

4. Run the following command to build and run the application:

   ```bash
   mvn spring-boot:run
 
5. Once the application runs, access it in your web browser at http://localhost:8080.

# Folder Structure
The project follows a standard Maven folder structure:

- src/main/java: Contains the Java source code.
- src/main/resources: Contains the application properties and static resources.
- src/main/webapp/WEB-INF/views: Contains JSP and Thymeleaf templates.
- src/test: Contains the test classes.
  
# Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

# License
This project is licensed under the MIT License. See the LICENSE file for more information.
