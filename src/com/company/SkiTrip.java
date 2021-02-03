package com.company;

public class SkiTrip extends Trip {

    //Fields
    private int slopes;
    private int lifts;

    public SkiTrip(String destination, int duration, String hotel, int price, int slopes, int lifts) {
        super(destination, duration, hotel, price);
        this.slopes = slopes;
        this.lifts = lifts;
    }

    public void setSlopes(int slopes) {
        this.slopes = slopes;
    }

    public void setLifts(int lifts) {
        this.lifts = lifts;
    }

    public int getSlopes() {
        return slopes;
    }

    public int getLifts() {
        return lifts;
    }

    @Override
    public String toString() {
        return "SkiTrip{" +
                "destination='" + destination + '\'' +
                ", duration=" + duration +
                ", hotel='" + hotel + '\'' +
                ", price=" + price +
                ", slopes=" + slopes +
                ", lifts=" + lifts +
                '}';
    }
}
