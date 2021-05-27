package Study;
import day14_multi_branch_if_statements.YesOrNo;

import java.util.Scanner;

public class Unit1 {
    public static void main(String[] args) {


        System.out.println("************************PERSONAL INFORMATION************************");

        Scanner scan = new Scanner(System.in);


        System.out.println("How many people do you live with?");
        int liveWithPeople = scan.nextInt();


        if (2 > liveWithPeople) {
            System.out.println("Live with less than 2 people");

        } else if (3 < liveWithPeople && liveWithPeople < 6) {
            System.out.println("Live with 3 - 6 people");

        } else if (liveWithPeople > 6) {
            System.out.println("Live with " + liveWithPeople + " people more than 6 people");
        } else {
            System.out.println("Invalid number");
        }


        System.out.println("What city do you live in?");

        String cityLive = scan.next();

        System.out.println("City = " + cityLive);


        System.out.println("Do you live in downtown " + cityLive + " ?");
        String yesOrNo = scan.next();
        if (yesOrNo.equals("yes")) {
            System.out.println("Have you thought about moving to the suburbs?");
            String movingToSuburbs = scan.next();
            if (movingToSuburbs.equals("yes")) {
                System.out.println("do it its great");
            } else {
                System.out.println("You should think about it");
            }
        }

        System.out.println("What is your favorite animal? ");
        String favoriteAnimal = scan.next();
        System.out.println("Wow" + favoriteAnimal + " animal is a great animal");
        System.out.println("How many pets do you want?");
        int numberOfPets = scan.nextInt();
        System.out.println("Interesting, do you want " + numberOfPets + " " + favoriteAnimal + "?");
        String wantAnimal = scan.next();

        System.out.println("***************************OPERATORS***************************");

        System.out.println("Analyze each step, What is the result of a, b, and c?");
        int a = 3, b = 2;
        long c = (a-- + b) * 2 / 3 % 2;
        System.out.println("c = " + c);

        System.out.println("======================================================");

        int numOne = 10;
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        int biggest = numOne > numTwo ? numOne : numTwo;

        System.out.println("==========================================================");
        System.out.println("*******************If statements, multi branch, nested****************");


        System.out.println("What kind of number from Asci table?\nPlease enter the number? ");
        char letter = scan.next().charAt(0);

        if (65 >= letter && letter <= 90) {
            System.out.println(letter + " is Uppercase");
        } else if (97 >= letter && letter <= 122) {
            System.out.println(letter + " is Lowercase");
        } else {
            System.out.println("invalid number");
        }


        System.out.println("Which years is there a pandemic? \n Please enter the year");
        double year = scan.nextInt();

        if (1346 <= year && year <= 1353) {
            System.out.println(year + " The Black Death");
        } else if (1665 <= year && year <= 1666) {
            System.out.println(year + "  Great Plague of London");
        } else if (1770 <= year && year <= 1772) {
            System.out.println(year + " Russian plague");
        } else if (1889 <= year && year <= 1890) {
            System.out.println(year + " Flu pandemic");
        } else if (1916 == year) {
            System.out.println(year + " American polio epidemic");
        } else if (1918 <= year && year <= 1920) {
            System.out.println(year + " Spanish Flu ");
        } else if (2009 <= year && year <= 2010) {
            System.out.println(year + ": H1N1 Swine Flu pandemic");
        } else if (2014 <= year && year <= 2016) {
            System.out.println(year + " West African Ebola epidemic\n");
        } else if (2020 <= year && year <= 2021) {
            System.out.println(year + " COVID-19");
        } else if (0 >= year || year >= 2021) {
            System.out.println("Invalid Year");
        } else {
            System.out.println("No pandemic");
        }

        System.out.println("********************TERNARY*****************************************");

        System.out.println("What time is it ?");
        int time1 = scan.nextInt();

        if (0 > time1 || 24 < time1) {
            System.out.println("Invalid Time ");

        } else {
            String result1 = (time1 < 12) ? "Morning" : "Night";
            System.out.println("Result = " + result1);




       System.out.println("***************SWITCH**************************");


            System.out.println("How many people live in the house?");
            int maxOccupants = scan.nextInt();
            String houseType;
            switch (maxOccupants) {
                case 1:
                    houseType = "Tree house";
                    System.out.println("House Type = " + houseType);
                    break;
                case 2:
                    houseType = "Mobile Home";
                    System.out.println("House Type = " + houseType);
                    break;
                case 4:
                    houseType = "Apartment";
                    System.out.println("House Type = " + houseType);
                    break;
                case 6:
                    houseType = "Town house";
                    System.out.println("House Type = " + houseType);
                    break;
                case 8:
                    houseType = "Villa";
                    System.out.println("House Type = " + houseType);
                    break;
                case 10:
                    houseType = "Mansion";
                    System.out.println("House Type = " + houseType);
                    break;
                default:
                    System.out.println("Invalid House Type");


            }
        }
    }
}