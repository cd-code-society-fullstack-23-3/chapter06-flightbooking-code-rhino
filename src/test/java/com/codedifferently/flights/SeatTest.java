package com.codedifferently.flights;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SeatTest {

    @Test
    public void constructorTest01(){
        // Given
        Seat seat = new Seat("Bob", "TheBuilder", "bob@thebuilder.com", SeatType.FIRST);

        // When
        String expected = "Passenger: TheBuilder, Bob; email:bob@thebuilder.com; Seat type: FIRST";
        String actual = seat.toString();

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void getAndSetFirstNameTest01(){
        Seat seat = new Seat("Bob", "TheBuilder", "bob@thebuilder.com", SeatType.FIRST);

        seat.setFirstName("Bobbert");
        String expected = "Bobbert";
        String actual = seat.getFirstName();

        assertEquals(expected, actual);
    }

    // Todo: Completing all the getters and setters for the class with unit test
}
