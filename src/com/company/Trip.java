package com.company;

public class Trip {

    //Fields
    protected String destination;
    protected int duration;
    protected String hotel;
    protected int price;

    //Constructors
    public Trip(String destination, int duration, String hotel, int price){
        this.destination = destination;
        this.duration = duration;
        this.hotel = hotel;
        this.price = price;
    }

    public Trip(){
    }

    //Methods
    public void setDestination(String newDestination){
        destination = newDestination;
    }

    public void setDuration(int newDuration){
        duration = newDuration;
    }

    public void setHotel(String newHotel){
        hotel = newHotel;
    }

    public void setPrice(int newPrice){
        price = newPrice;
    }

    public String getDestination() {
        return destination;
    }

    public int getDuration() {
        return duration;
    }

    public String getHotel() {
        return hotel;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "destination='" + destination + '\'' +
                ", duration=" + duration +
                ", hotel='" + hotel + '\'' +
                ", price=" + price +
                '}';
    }
}
