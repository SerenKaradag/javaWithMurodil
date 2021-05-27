package day26_loops;

public class WeekDays {
    public static void main(String[] args) {


        for(int days = 1; days< 10; days++){

        switch(days) {
            case 1:
                System.out.println(days +" - Monday");
                break;
            case 2:
                System.out.println(days +" - Tuesday");
                break;
            case 3:
                System.out.println(days +" - Wednesday");
                break;
            case 4:
                System.out.println(days +" - Thursday");
                break;
            case 5:
                System.out.println(days +" - Friday");
                break;
            case 6:
                System.out.println(days +" - Saturday");
                break;
            case 7:
                System.out.println(days +" - Sunday");
                break;
            default:
                System.out.println(days +"no such a day, it is java day");
                break;


        }
        }
    }
}
