package day52_inheritance.discordusers;

public class User extends Object { // EXTENDS OBJECT ALWAYS HERE

    private String role , name;
    private int id;


    public User() {
        //SAME NAME WITH THE CLASS AND NO ARGS CONSTRUCTOR NO RETURN TYPE
        System.out.println("Uses class constructor");
    }

    public User(String role, String name, int id) {
        System.out.println("User class 3 args constructor ");
        this.role = role;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
