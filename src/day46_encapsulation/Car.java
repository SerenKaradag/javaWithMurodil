package day46_encapsulation;

public class Car {

    //encapsulation/
    // hidden instance variables
    private String model;
    private int  year;
    private int millage;


   //setter method for model

    public void setModel(String carModel){
        model = carModel;
    }

    //getter method for model
    public String getModel(){
        return model;
    }

    //setter for year
    public void setYear(int year) {
        this.year = year;
    }

    //getter for year
    public int getYear(){
        return year;
    }

    public void setMillage(int millage){
        this.millage = millage;
    }

    public int getMillage(){
        return millage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}

