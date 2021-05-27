package OfficeHours;

public class AgeToDays {

    public static void main(String[] args){

        int age = 30;
        int  ageInDays = 365 * age;

        System.out.println(ageInDays);

        System.out.println("You are " + age + "years old! " +
                "Thats means you are " + ageInDays + "day old");
    }
}
