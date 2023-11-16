package com.codedifferently.flights;

import java.time.LocalTime;

public class Flight {
    private String flightNumber;
    private String departureLocation;
    private String destinationLocation;
    private LocalTime arrivalTime;
    private LocalTime departureTime;
    private Seat[] firstClass;
    private Seat[] businessClass;
    private Seat[] economyClass;

    public Flight(String flightNumber, String departureLocation, String destinationLocation, LocalTime departureTime, LocalTime arrivalTime) {
        this.flightNumber = flightNumber;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;

    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public Seat[] getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(Seat[] firstClass) {
        this.firstClass = firstClass;
    }

    public Seat[] getBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(Seat[] businessClass) {
        this.businessClass = businessClass;
    }

    public Seat[] getEconomyClass() {
        return economyClass;
    }

    public void setEconomyClass(Seat[] economyClass) {
        this.economyClass = economyClass;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Flight No: %s departing from %s at %s ",flightNumber, departureLocation, departureTime.toString()));
        builder.append(String.format("and flying to %s at %s", destinationLocation, arrivalTime.toString()));
        return builder.toString();
    }
}
