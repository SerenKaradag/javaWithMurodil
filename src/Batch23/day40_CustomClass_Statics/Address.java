package Batch23.day40_CustomClass_Statics;

public class Address {

    public String buildingNumber, street, city, state;
    public int zipCode;

    public static String country = "USA";

    public  static void setInfo(){

        System.out.println(country);
    }

    @Override
    public String toString() {
        return "Address{" +
                "buildingNumber='" + buildingNumber + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
