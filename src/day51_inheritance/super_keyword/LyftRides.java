package day51_inheritance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft Ride = new Lyft();
        LyftXL XLRide = new LyftXL();
        Lux LuxRide = new Lux();

        System.out.println("Lyft for 5 miles = " + Ride);
        System.out.println("XLRide for 5 miles = " + XLRide);
        System.out.println("LuxRide for 5 miles= " + LuxRide);
    }
}
