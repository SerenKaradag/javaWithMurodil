package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {

        int last4SSN = 1234;
        int pinCode = 4321;
        int expLastSSN = 1234;
        int expPinCode = 4321;


        if(last4SSN == expLastSSN && pinCode == expPinCode){
            System.out.println("Authentication successful");
        }else {
            System.out.println("Authentication unsuccessful");
        }if(last4SSN != expLastSSN){
            System.out.println("Last 4 SSN number incorrect");
        }
        if (expPinCode != pinCode){
            System.out.println("Pin Code is incorrect");
        }



    }
}
