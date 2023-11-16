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
    public void constructorTest02(){
        Seat seat = new Seat(SeatType.FIRST);
        String expected = "Passenger: empty; Seat type: FIRST";
        String actual = seat.toString();

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

    @Test
    public void getAndSetLastNameTest01(){
        Seat seat = new Seat("Bob", "TheBuilder", "bob@thebuilder.com", SeatType.FIRST);

        seat.setLastName("TheFlyGuy");
        String expected = "TheFlyGuy";
        String actual = seat.getLastName();

        assertEquals(expected, actual);
    }

    @Test
    public void getAndSetEmailTest01(){
        Seat seat = new Seat("Bob", "TheBuilder", "bob@thebuilder.com", SeatType.FIRST);

        seat.setEmail("bobberttheflyguy@yahoo.com");
        String expected = "bobberttheflyguy@yahoo.com";
        String actual = seat.getEmail();

        assertEquals(expected, actual);
    }

    @Test
    public void getAndSetType01(){
        Seat seat = new Seat("Bob", "TheBuilder", "bob@thebuilder.com", SeatType.ECONOMY);
        seat.setType(SeatType.FIRST);
        SeatType expected = SeatType.FIRST;
        SeatType actual = seat.getType();

        assertEquals(expected, actual);
    }

    @Test
    public void isAvailableTest01(){
        Seat seat = new Seat(SeatType.FIRST);
        Boolean actual = seat.isAvailable();

        assertTrue(actual);
    }

    @Test
    public void isAvailableTest02(){
        Seat seat = new Seat("Bob", "TheBuilder", "bob@thebuilder.com", SeatType.ECONOMY);
        assertFalse(seat.isAvailable());
    }

    // Todo: Completing all the getters and setters for the class with unit test
}
