package OfficeHours;
import java.util.Scanner;
public class Seasons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the seasons number:\n1-Spring\n2-Summer\n3-Fall\n4-Winter");
        int season= scan.nextInt();
        // ==
        int seasons =scan.nextInt();
        int day = 0;
        int night = 0;
        String seasonName = " ";

        if(seasons == 1) {
            day = 14;
            night = 10;
            seasonName = "Spring";
        }
        if(seasons == 2){
            day = 16;
            night = 10;
            seasonName = "Summer";
        }
        if(seasons == 3){
            day = 14;
            night = 10;
            seasonName = "Fall";

        }
        if(seasons == 4){
            day = 12;
            night = 12;
            seasonName = "Winter";

        }
        System.out.println("in " + seasonName + " there is " + day +
                "hours of dayLight and" + night + "hours nighttime");
    }
}
