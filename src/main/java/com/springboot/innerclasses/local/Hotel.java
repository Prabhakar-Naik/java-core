package com.springboot.innerclasses.local;

/**
 * @author prabhakar, @Date 25-12-2024
 */
public class Hotel {

    private String name;
    private int totalRooms;
    private int reserveRooms;


    public Hotel(String name, int totalRooms, int reserveRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reserveRooms = reserveRooms;
    }

    public void reserveRooms(String guestName, int numOfRooms){

        class ReservationValidator{
            boolean validate(){
                if (guestName == null || guestName.isBlank()){
                    System.out.println("Guest Name can not be empty");
                    return false;
                }
                if (numOfRooms < 0){
                    System.out.println("Number of Rooms should be positive");
                    return false;
                }
                if (reserveRooms + numOfRooms > totalRooms){
                    System.out.println("Not enough rooms available.");
                    System.out.println("We have "+numOfRooms+ " Available Rooms.");
                    return false;
                }
                return true;
            }
        }

        ReservationValidator validator = new ReservationValidator();
        if (validator.validate()){
            reserveRooms += numOfRooms;
            System.out.println("Reservation Confirmed for: "+guestName+" for "+numOfRooms+" Room.");
        }else {
            System.out.println(guestName+" Your Reservation Failed.");
        }
    }
}
