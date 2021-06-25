package day56_abstraction.driveable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements Greeting, SelfDrivable {
    @Override
    public void transportPeople() {
        System.out.println("Flying on city to an other city");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs " + (mile * 0.10) + " to drive " + mile +  " miles ");
    }

    @Override
    public void hi() {
        System.out.println("Welcome board");
    }

    @Override
    public void bye() {
        System.out.println("Good bye");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Flying on Auto-pilot mode");
    }


}
