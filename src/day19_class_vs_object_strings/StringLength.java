package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());

        System.out.println("count: " + word.length());
        System.out.println("wooden spoon:".length() );
        String firstName = "Seren";
        System.out.println(firstName + " - " + firstName.length());



        int count = firstName.length(); // if String is number DECLARE INT AND ASSIGN VALUE
        System.out.println("count = " + count);


        String password = "abc123";

        if(password.length() >= 6){
            System.out.println("Valid Password");
        }else if(password.length() <= 6){
            System.out.println("Password too short");
        }

         double password1 = 456789523.54432116841789456123;
        System.out.println("password1 ".length());
        System.out.println("password1 = " + password1);



    }
}
