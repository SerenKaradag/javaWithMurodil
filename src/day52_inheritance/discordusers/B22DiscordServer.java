package day52_inheritance.discordusers;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();  /// we are calling USER constructor
        user1.setId(1234);
        user1.setName("Suleyman");
        user1.setRole("Student");
        // User > Admin
        Admin admin1 = new Admin(); //FIRST GOING TO ADMIN CLASS AND USER EXTENDS TO ADMIN CLASS
        //THATS WHY ITS GOING TO USER CLASS AFTER ADMIN
        admin1.setId(43145);
        admin1.setName("Burak Kara");
        admin1.setRole("Admin");

        System.out.println(user1);
       System.out.println(admin1);

        Admin admin2 = new Admin("Gullia", 4138);
        System.out.println(admin2.toString());
    }
}
