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

    public Seat(SeatType type){
        this.type = type;
        this.firstName = "";
        this.lastName = "";
        this.email = "";
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public SeatType getType(){
        return type;
    }

    public void setType(SeatType type){
        this.type = type;
    }

    public Boolean isAvailable(){
        boolean available = (firstName.equals("") && lastName.equals("") && email.equals(""));
        return available;
    }
    public String toString(){
        StringBuilder builder = new StringBuilder();
        if(firstName.equals("") || lastName.equals("") || email.equals(""))
            return String.format("Passenger: empty; Seat type: %s", type.toString());
        builder.append(String.format("Passenger: %s, %s;",lastName, firstName));
        builder.append(String.format(" email:%s;", email));
        builder.append(" Seat type: " + type.toString());
        return builder.toString();
    }
}
