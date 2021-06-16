package day54_abstraction;

public class CampusStudent extends Student{

    @Override
    public void attendClass(){
        System.out.println("Online student is attending the class using Zoom");
    }
}
