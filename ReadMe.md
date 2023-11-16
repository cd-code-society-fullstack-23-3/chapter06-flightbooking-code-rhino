# Flight Booking Application

#### Objective:

Develop a Flight Booking application using Java that allows users to book flights in different classes. This assignment will enhance your understanding of Java fundamentals, object-oriented programming, and arrays.

#### Tools Required:
- Java Development Kit (JDK)
- Integrated Development Environment (IDE) like Eclipse, IntelliJ IDEA, or NetBeans

#### Key Concepts:
- Object-Oriented Programming
- Arrays and Enums
- Basic Input/Output operations

#### Task Overview:
1. **MainApplication Class**: This class will serve as the entry point for your application. It will manage the user interface and handle user inputs.

2. **Flight Class**: Represents flight details and manages seat bookings.

3. **Seat Class**: Represents a seat on the flight with passenger details.

#### Detailed Instructions:

1. **MainApplication Class**:
    - Create a class named `MainApplication`.
    - Implement a terminal menu that allows users to view available flights and book seats.
    - Store an array of `Flight` objects, representing available flights.
    - Implement methods for handling user inputs and invoking appropriate actions.

2. **Flight Class**:
    - Create a class named `Flight` with the following attributes:
        - `String` for flight number
        - `String` for departure and destination locations
        - `LocalTime` for take-off and departure times (use `java.time.LocalTime`)
    - Define three arrays, each with a fixed size of 10, to represent seats:
        - `firstClassSeats`
        - `businessClassSeats`
        - `economyClassSeats`
    - Each array should hold objects of type `Seat`.
    - Implement methods to book a seat in a specific class.

- `public boolean bookFlight(SeatType seatType)`: This method will handle booking a seat based on the specified seat type (FIRST, BUSINESS, ECONOMY). It should check for available seats in the corresponding array (firstClassSeats, businessClassSeats, economyClassSeats). If an available seat is found, the method should set that seat as occupied and return `true`. If no seats are available, it should return `false`.
- Implement logic inside `bookFlight` to iterate over the appropriate array of seats. When an unoccupied seat is found, mark it as occupied and update the seat's information with the booking details.

- Ensure that each `Seat` object has an attribute to indicate whether it is occupied or not.

3. **Seat Class**:
    - Create a class named `Seat` with the following attributes:
        - `String` for firstName
        - `String` for lastName
        - `String` for email
        - `SeatType` enum for the seat type
    - Define an enum named `SeatType` with values `FIRST`, `BUSINESS`, and `ECONOMY`.

4. **Functionality**:
    - Users should be able to choose a flight and book a seat in either first class, business class, or economy.
    - The system should check for seat availability before confirming a booking.
    - Implement error handling for cases like invalid input or fully booked flights.

5. **Bonus Challenges** (Optional):
    - Implement a feature to cancel a booking.
    - Add a pricing model and calculate the total cost of a booking based on the class.
    - Extend the application to handle multiple airlines.

#### Submission Guidelines:
- Submit the source code files for `MainApplication`, `Flight`, and `Seat` classes.
- Include comments in your code to explain your logic.
- Ensure your code is formatted and follows Java coding conventions.

#### Evaluation Criteria:
- Correct implementation of object-oriented concepts.
- Functionality of the application as per requirements.
- Code readability and organization.
- Error handling and input validation.


Certainly! I'll integrate these additional instructions into the lab assignment, focusing on the `Flight` class and its `bookFlight` method.

---

### Java Programming Lab: Flight Booking Application (Updated Instructions)

#### Objective:
Develop a Flight Booking application using Java, focusing on object-oriented programming, array manipulation, and basic user interaction.

Certainly! Here's a UML (Unified Modeling Language) diagram for the Flight Booking application, which includes the `MainApplication`, `Flight`, and `Seat` classes, along with their relationships and key methods.

### UML Diagram for Flight Booking Application

#### 1. MainApplication Class
- **Attributes**:
    - `flights`: Flight[]
- **Methods**:
    - `main(String[] args)`: void
    - `displayMenu()`: void


#### 2. Flight Class
- **Attributes**:
    - `flightNumber`: String
    - `departureLocation`: String
    - `destinationLocation`: String
    - `takeOffTime`: LocalTime
    - `departureTime`: LocalTime
    - `firstClassSeats`: Seat[10]
    - `businessClassSeats`: Seat[10]
    - `economyClassSeats`: Seat[10]
- **Methods**:
    - `bookFlight(String firstName, String lastName, String  email, SeatType seatType)`: boolean

#### 3. Seat Class
- **Attributes**:
    - `firstName`: String
    - `lastName`: String
    - `email`: String
    - `seatType`: SeatType
- **Methods**:
    - None (Standard getters and setters can be assumed)

#### 4. SeatType Enum
- **Values**:
    - `FIRST`
    - `BUSINESS`
    - `ECONOMY`
