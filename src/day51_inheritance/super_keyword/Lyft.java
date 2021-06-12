package day51_inheritance.super_keyword;

public class Lyft {
    @Override
    public String toString() {
        return "Lyft{}";
    }

    public double calculateRate(double miles){
        return miles * 4.5;
    }


}
