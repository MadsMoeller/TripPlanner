package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Trip t1 = new Trip("Brazil", 14, "Best Hotel of the Ages", 12000);
	    //System.out.println(t1);

	    Trip bt1 = new BeachTrip("Hainan", 21, "Hotel of Fragrant Bliss", 7499, 5, "Sandy");
	    //System.out.println(bt1);

	    Trip st1 = new SkiTrip("Switzerland", 5, "Piz Gloria", 1500, 2, 1);
        //System.out.println(st1);

        ArrayList<Trip> trips = new ArrayList<>();
        Scanner console = new Scanner(System.in);

        trips.add(t1);
        trips.add(bt1);
        trips.add(st1);
        addTripMenu(trips, console);
        printList(trips);
    }

    public static void addTripMenu(ArrayList<Trip> trips, Scanner console){
        System.out.println("Add:\n(1)beach trip\n(2)ski trip");
        int answer = 0;
        while((answer != 1) && (answer != 2)) {
            answer = console.nextInt();
            console.nextLine();
            switch (answer) {
                case 1:
                    System.out.println("Adding beach trip!");
                    addTrip(trips, console, "beach");
                    break;
                case 2:
                    System.out.println("Adding ski trip!");
                    addTrip(trips, console, "ski");
                    break;
                default:
                    System.out.println("Please input 1 or 2.");

            }
        }
    }

    public static void addTrip(ArrayList<Trip> trips, Scanner console, String type){
        System.out.print("Input destination: ");
        String dest = console.nextLine();
        System.out.print("Input duration in days: ");
        int dur = console.nextInt();
        console.nextLine();
        System.out.print("Input hotel name: ");
        String hotel = console.nextLine();
        System.out.print("Input price in dkk rounded to nearest integer: ");
        int price = console.nextInt();
        console.nextLine();
        if(type.equals("beach")){
            addBeachTrip(trips, console, dest, dur, hotel, price);
        }else if(type.equals("ski")){
            addSkiTrip(trips, console, dest, dur, hotel, price);
        }else{
            trips.add(new Trip(dest, dur, hotel, price));
        }
    }

    public static void addBeachTrip(ArrayList<Trip> trips, Scanner console, String destination, int duration, String hotel, int price){
        System.out.print("Input estimated number of ice creams eaten each day: ");
        int enoic = console.nextInt();
        console.nextLine();
        System.out.print("Input beach type: ");
        String bType = console.nextLine();
        trips.add(new BeachTrip(destination, duration, hotel, price, enoic, bType));
    }

    public static void addSkiTrip(ArrayList<Trip> trips, Scanner console, String destination, int duration, String hotel, int price) {
        System.out.print("Input number of slopes: ");
        int slopes = console.nextInt();
        console.nextLine();
        System.out.print("Input number of lifts: ");
        int lifts = console.nextInt();
        console.nextLine();
        trips.add(new SkiTrip(destination, duration, hotel, price, slopes, lifts));
    }

    public static void printList(ArrayList<Trip> trips){
        for (int i = 0; i < trips.size(); i++) {
            System.out.println(trips.get(i));
        }
    }
}
