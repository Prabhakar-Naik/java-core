package com.springboot.innerclasses.local;

/**
 * @author prabhakar, @Date 25-12-2024
 */
public class HotelTest {

    public static void main(String[] args) {

        Hotel hotel = new Hotel("Pavan Hotel",10,5);
        hotel.reserveRooms("Prabhakar",3);
        hotel.reserveRooms("",3);
        hotel.reserveRooms("Shubham",5);
        hotel.reserveRooms(null,3);
    }
}
