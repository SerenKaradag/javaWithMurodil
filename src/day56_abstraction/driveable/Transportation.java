package day56_abstraction.driveable;

public abstract class Transportation {

    public abstract void transportPeople(); // SUB CLASSES
    public abstract void cost(int mile);// SUB CLASSES
    public void start(){// SUB CLASSES
        System.out.println("Starting the engine");
    }
    public void stop(){// SUB CLASSES
        System.out.println("Shut off the engine");
    }
}
