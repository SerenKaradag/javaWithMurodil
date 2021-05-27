package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "CYBERTEK";
        String expPassword = "123Acc";

        String userName = "Cybertek";
        String password = "abc123";

        if(expUserName.equalsIgnoreCase("Cybertek" ) && expPassword.equals("123Abc") ){
            System.out.println("Pass - user successfully logged in " );
        }else{
            System.out.println("Incorrect Username");
            if(expUserName.equalsIgnoreCase(userName)){
                System.out.println("Fail -User name is incorrect!");
            }else{
                System.out.println("Fail - Password is incorrect!");
            }
        }
    }
}
