package day15_logicallops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";
        String city1 = "Tampa";

        if(city.equals("Moscow") || city.equals("Tampa")){
            System.out.println("Willing to relocate to "+ city);
        }else{
            System.out.println("Not considering - "+ city);
        }


        String teacher = "Nadir";
        //Saim, Murodil --> its is a java class with Saim
        // otherwise --> Soft skill class with Nadir

        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("its is a java class with "+ teacher);
        }else{
            System.out.println("Soft skill class with  "+ teacher);
        }







            teacher = "Nadir";

        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("Java class with "+ teacher);
        }else if (teacher.equals("Nadir")){
            System.out.println("Soft skill class with  "+ teacher);
        }else{
            System.out.println("Some class with - " + teacher);
        }






        //company - "Google", salary >= 100k

        String company = "NadirTech";
        double salary = 90.000;
         if(company.equals("Google") || salary >= 100.000){
            System.out.println("Accept offer "+ company);
        }else {
            System.out.println("Rejecting offer from " + company);
        }



    }
}
