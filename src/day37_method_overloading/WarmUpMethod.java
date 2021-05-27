package day37_method_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
      loginVoid("Cybertekstudent" , "abcd123"); //POSITIVE TEST / SUNNY DAY
        loginVoid("cybertek", "answer");// NEGATIVE / RAINY DAY SCENARIO
        login("", "");
     //   loginVoid("Cybertekstudent" , "abc123"); // ERROR - VOID - NO RETURN VALUE. WE CAN NOT CALLING AGAIN.
        System.out.println(login("cybertekStudent" , "abcd123"));
        if(login("cybertekStudent" , "abcd123")){
            System.out.println("Login succesfull, welcome to Canvas");
            System.out.println("Select the course to contiunue");
        }else{
            System.out.println("Login failed");
        }

        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);

        if(login("nadir", "mountain")){

        }







    }

    public static void loginVoid(String userName, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if(userName.equalsIgnoreCase(secretUserName)&& password.equals(secretPassword)){
            System.out.println("Login successful, welcome CybertekStudent!");
        }else{
            System.out.println("Incorrect username or password");
        }
    }

     public static boolean login(String userName, String password){
         String secretUsername = "cybertekStudent";
         String secretPassword = "abcd123";
        /** return(userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword));
         * SAME IS IF CONDITION IT IS GIVEN BOOLEAN ITSELF*/
         if(userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)){
             return true; // RETURN TRUE, AND EXIT METHOD HER.RETURN FALSE WILL NOT RUN
         }
             return false;

     }
     }





