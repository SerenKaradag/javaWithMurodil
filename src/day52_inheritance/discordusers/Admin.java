package day52_inheritance.discordusers;

public class Admin extends User{  // OBJECT IN THE HEAP


    public Admin() {
        super(); // call super class/ user class no-args constructor
        //ONLY CONSTRUCTOR METHOD INSIDE ITS IS WORK.
        System.out.println("Admin class constructor");
    }

    public Admin (String name, int id){
        super("Admin", name, id);
        System.out.println("Admin class 2 args constructor");
    }

    public String toString(){
        return "Admin{"  +
                "role='" + getRole() + '\'' +
                ", name='"  + getName()+ '\'' ;

    }

}
