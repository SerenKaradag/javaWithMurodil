package day55_abstraction.exercise_example;

public abstract class Exercise {
    public void start(){
        System.out.println("Warming up and starting the exercise");
    }

    /**
     * //abstract method = method without body/impl , just signature
     * purpose - letting sub clases implement/overide their own way
     */

    public abstract void perform();

    /**
     * another  abstract method that concrete sub clases will override/implement
     * @param minutes - how long is exercise
     * @return we are assuming avg num of calories while running is 13
     */


    public abstract int getCaloriesCount(int minutes);
}
