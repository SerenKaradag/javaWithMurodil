package day53_inheritance.tesla;

public class ModelX extends ElectricCar {

    public ModelX(String make, String model, double price, int year, int range) {
        super(make, model, price, year, range);
    }

    /**
     * ERROR BELOW, because charge is final method. can not be overridden
     */

    //   public void change(){}
}
