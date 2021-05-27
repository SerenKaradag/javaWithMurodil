package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if(city.equals("Los Angeles")){
            System.out.println("Its LA");
        }else{
            System.out.println("Its not LA");
        }

        String weather = "Sunny";
        // if(weather == "sunny") <-- its works but AVOID
        if(weather.equals("Sunny")){
            System.out.println("LEts go out and code java!");

        }else{
            System.out.println("LEts stay indoors, and code java");
        }
    }
}
