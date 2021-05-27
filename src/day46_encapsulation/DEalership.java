package day46_encapsulation;

public class DEalership {
    public static void main(String[] args) {
        Car car1 = new Car();
      //  car1.model = "Nissan Altima";
       // car1.year = 2020;
        //car1.year = 2020;

        car1.setModel("Nissan Altima");
     //   System.out.println("car model = " + model);  ENCAPSULATION
        System.out.println("car model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());


        car1.setMillage(45230);
        System.out.println("car1 mileage = " + car1.getMillage());

        System.out.println(car1.toString());
        System.out.println(car1); // automatically calls toString

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("alfa romeo ti awd");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMillage(16604);


        System.out.println("Model = " + alfaRomeo.getModel());
        System.out.println("Year = " + alfaRomeo.getYear());
        System.out.println("Millage = " + alfaRomeo.getMillage());











    }
}
