package com.codedifferently.flights;

public class Seat {

    private String firstName;
    private String lastName;
    private String email;
    private SeatType type;

    public Seat(String firstName, String lastName, String email, SeatType type){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.type = type;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Passenger: %s, %s;",lastName, firstName));
        builder.append(String.format(" email:%s;", email));
        builder.append(" Seat type: " + type.toString());
        return builder.toString();
    }
}
