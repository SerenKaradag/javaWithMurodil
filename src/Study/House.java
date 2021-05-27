package Study;
import java.util.Scanner;

public class House {
    public static void main(String[] args){
   Scanner scan = new Scanner(System.in);

         System.out.println("Which years is there a pandemic? \n Please enter the year?");

        int year =scan.nextInt();
        if(1346 <= year && year <= 1353){
            System.out.println(year + " The Black Death");
        }else if(1665 <= year && year <= 1666){
            System.out.println(year + "  Great Plague of London");
        }else if( 1770<= year && year <= 1772){
            System.out.println(year + " Russian plague");
        }else if(1889 <= year && year <= 1890 ){
            System.out.println(year + " Flu pandemic");
        }else if(1916 == year ){
            System.out.println(year + " American polio epidemic");
        }else if(1918 <= year && year <= 1920){
            System.out.println(year + " Spanish Flu ");
        }else if(2009 <= year && year <= 2010){
            System.out.println(year + ": H1N1 Swine Flu pandemic");
        }else if(2014 <= year && year <= 2016){
            System.out.println(year + " West African Ebola epidemic\n");
        }else if(2020 <= year && year <= 2021){
            System.out.println(year + " COVID-19");
        }else if(0 >= year || year >= 2021){
            System.out.println("Invalid Year");
        }else{
            System.out.println("No pandemic");
        }

    }

}
