package day55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
     //   Exercise exercise = new Exercise(); // CAN NOT CREATE OBJECT/INSTANTIATE ABSTRACT CLASS

        Exercise exercise = new Swimming();
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Runnig 30 min - calories   =   " + exercise.getCaloriesCount(30));

       swimming.start();
        swimming.perform();
        System.out.println("Swimming 30 min - calories   =   " + exercise.getCaloriesCount(30));


        freeWeight.start();
       freeWeight.perform();
        System.out.println("FreeWeight 30 min - calories   =   " + exercise.getCaloriesCount(30));






    }
}
