package day56_abstraction.driveable;

public interface SelfDrivable {
    void autoPiloting();
     // void selfPark();
    public default void selfPark(){
        System.out.println("performing self park steps");
    }
}
