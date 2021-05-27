package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "Dodge charger";
        String driverName ="Seren";
        String licenseNum = "Java12345";
        short speed = 55;
        boolean isAutomatic = true;
        char licenseClass ='D';

        System.out.println("Car model : "+ carModel);
        System.out.println(carModel +  " is car model.");
        System.out.println(driverName + " is driving a car.");
        System.out.println(driverName +" is driving " + carModel);
        System.out.println("Current speed is: " + speed);
        System.out.println("Current speed is:" + speed + " MPH");
        System.out.println("is car automatic --> "+ isAutomatic);
        System.out.println(licenseNum +" - "+ isAutomatic);
    }
}
