package com.codedifferently.flights;

import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightTest {

    @Test
    void controllerTest01(){
        Flight flight = new Flight("FL123", "CityA", "CityB", LocalTime.of(9, 45), LocalTime.of(10, 30));

        String expected = "Flight No: FL123 departing from CityA at 09:45 and flying to CityB at 10:30";
        String actual = flight.toString();

        assertEquals(expected, actual);

    }

    @Test
    void testFlightNumberSetterAndGetter() {
        // Given
        Flight flight = new Flight("FL123", "CityA", "CityB", LocalTime.of(10, 30), LocalTime.of(9, 45));
        String newFlightNumber = "FL456";

        // When
        flight.setFlightNumber(newFlightNumber);

        // Then
        assertEquals(newFlightNumber, flight.getFlightNumber());
    }

    @Test
    void testDepartureLocationSetterAndGetter() {
        // Given
        Flight flight = new Flight("FL123", "CityA", "CityB", LocalTime.of(10, 30), LocalTime.of(9, 45));
        String newDepartureLocation = "CityC";

        // When
        flight.setDepartureLocation(newDepartureLocation);

        // Then
        assertEquals(newDepartureLocation, flight.getDepartureLocation());
    }

    @Test
    void testDestinationLocationSetterAndGetter() {
        // Given
        Flight flight = new Flight("FL123", "CityA", "CityB", LocalTime.of(10, 30), LocalTime.of(9, 45));
        String newDestinationLocation = "CityD";

        // When
        flight.setDestinationLocation(newDestinationLocation);

        // Then
        assertEquals(newDestinationLocation, flight.getDestinationLocation());
    }

    @Test
    void testArrivalTimeSetterAndGetter() {
        // Given
        Flight flight = new Flight("FL123", "CityA", "CityB", LocalTime.of(10, 30), LocalTime.of(9, 45));
        LocalTime newTakeOffTime = LocalTime.of(11, 15);

        // When
        flight.setArrivalTime(newTakeOffTime);

        // Then
        assertEquals(newTakeOffTime, flight.getArrivalTime());
    }

    @Test
    void testDepartureTimeSetterAndGetter() {
        // Given
        Flight flight = new Flight("FL123", "CityA", "CityB", LocalTime.of(10, 30), LocalTime.of(9, 45));
        LocalTime newDepartureTime = LocalTime.of(10, 00);

        // When
        flight.setDepartureTime(newDepartureTime);

        // Then
        assertEquals(newDepartureTime, flight.getDepartureTime());
    }








}
