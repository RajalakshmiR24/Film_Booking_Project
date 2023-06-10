# Film_Booking_Project
This is a Film Booking project built using Spring Boot, JPA, and Hibernate. It allows users to book film tickets online and receive email confirmation from the theater owner.

## Features

1. User Registration: Users can register with their email address and create an account.
2. User Login: Registered users can log in to their account using their credentials.
3. Film Listing: Users can view the list of available films.
4. Film Details: Users can view the details of a specific film, including its title, description, and show timings.
5. Seat Selection: Users can select seats for a particular film show.
6. Booking Confirmation: Users can confirm their seat selection and proceed with the booking.
7. Email Confirmation: The theater owner sends a confirmation email to the user's registered email address, containing the booking details and ticket information.

## Prerequisites

Before running this project, make sure you have the following:

1. Java Development Kit (JDK) installed.
2. MySQL Workbench or any other MySQL client installed.
3. An email account for sending confirmation emails.

## Installation

Follow these steps to run the project locally:

1. Clone this repository to your local machine.
   ```shell
   https://github.com/RajalakshmiR24/Film_Booking_Project.git

## Database Configuration

The project uses Hibernate to automatically create the database schema based on the entity classes. Follow these steps to create the required database using Hibernate:

1. Open MySQL Workbench or any other MySQL client.

2. Connect to your MySQL server.

3. Run the following command to create the `bus_seat_project` database:

   ```sql
   CREATE DATABASE bus_seat_project;
   
## Technologies Used

- Java
- Spring Boot
- JPA (Java Persistence API)
- Hibernate
- MySQL
- HTML/CSS
- Thymeleaf (Java-based templating engine)
- SMTP (Simple Mail Transfer Protocol)

## Contributing

Contributions to this project are welcome. If you find any bugs or want to add new features, feel free to submit a pull request.

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
