package day48_constructor_static;


import java.util.Arrays;

public class CybertekGroup {
    public static void main(String[] args) {

      Group group1 = new Group("Cyberbugs"); // dependency injection.// Group object creation depends on String name
        // print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Ahmet");
        group1.addMember("Seren");
        group1.addMember("Elvin");

        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("People1", "People2" , "People3", "People4", "People5", "People6", "People7"));
          // DONT USE TO STRING SECOND OPINION
        System.out.println(group2.getMembers());



        if(group2.getMembers().contains("People4")){
            System.out.println("People4 is member of group2");
        }else{
            System.out.println("People4 is not member of group2");
        }
    }
}
