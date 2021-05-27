package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args){
        String city = "ChiCago";
        System.out.println(city.equals("Chicago"));
        System.out.println(city.equals("chicago"));
        System.out.println(city.equals("Chicago"));

        // EQUALSIGNORECASE()
        System.out.println(city.equalsIgnoreCase("Chicago"));
        System.out.println(city.equalsIgnoreCase("CHICAGO"));
        System.out.println(city.equalsIgnoreCase("ChiCaGo"));
        System.out.println(city.equalsIgnoreCase(("Chi cago"))); //does not matter upper or lowercase letter

        if(city.equals("Chicago")){
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");
        }

        if(city.equalsIgnoreCase("Chicago")){
            System.out.println("equalsIgnoreCase() true");
        }else{
            System.out.println("equalsIgnoreCase() false");
        }

        String etsyTitle = "Wooden spoon | Etsy";

        if(etsyTitle.contains(" | ")){
            System.out.println("Pass - title check passed");
        }else{
            System.out.println("Fail - title check failed");
        }

        String firstName = "ahmed";

        if(firstName.contains("a")&&firstName.contains("e")){
            System.out.println("Pass");
        }else{
            System.out.println("incorrect");
        }


        String firstName1 = "Nadir";

        if(firstName.contains("a") || firstName.contains("i")){
            System.out.println("a or i is present");
        }else{
            System.out.println("nor a or i is present");
        }

        String email = "SRN488@gmail.com";

        if (email.contains("@") && (email.endsWith(".com"))){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        if(email.toLowerCase().contains("r")){
            System.out.println(email);
        }else{
            System.out.println("r is not present");
        }






    }
}
