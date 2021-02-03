package com.company;

public class BeachTrip extends Trip {

    //Fields
    private int estimatedIcecreamsPerDay;
    private String beachType;

    public BeachTrip(String destination, int duration, String hotel, int price, int estimatedIcecreamsPerDay, String beachType) {
        super(destination, duration, hotel, price);
        this.estimatedIcecreamsPerDay = estimatedIcecreamsPerDay;
        this.beachType = beachType;
    }

    public void setEstimatedIcecreamsPerDay(int newEstimatedIcecreamsPerDay) {
        estimatedIcecreamsPerDay = newEstimatedIcecreamsPerDay;
    }

    public void setBeachType(String newBeachType) {
        beachType = newBeachType;
    }

    public int getEstimatedIcecreamsPerDay() {
        return estimatedIcecreamsPerDay;
    }

    public String getBeachType() {
        return beachType;
    }

    @Override
    public String toString() {
        return "BeachTrip{" +
                "destination='" + destination + '\'' +
                ", duration=" + duration +
                ", hotel='" + hotel + '\'' +
                ", price=" + price +
                ", estimatedIcecreamsPerDay=" + estimatedIcecreamsPerDay +
                ", beachType='" + beachType + '\'' +
                '}';
    }
}
