package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {

        String make = "Mercedes";
        String model = "A";
        double leasePrice = 0.0;

//        if(make.equals("Mercedes") && model.equals("E")) {
//            leasePrice = 500.0;
//        }else if (make.equals("Mercedes") && model.equals("A")) {
//            leasePrice = 400.0;
//        }
        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500.0;
            }else if (model.equals("A")) {
                leasePrice = 400.0;
            }
        }else {
            System.out.println("Invalid make");
        }

        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);



        String make1 = "Mercedes";
        char model1 = 'E';
        double leasePrice1 =0.0;

        if(make.equals("Mercedes") && model1 == 'A'){
            leasePrice1 = 500;
        }else if(make.equals("Mercedes") && model1 == 'E'){
            leasePrice1 = 400;
        }


        if(make1.equals("Mercedes")) {

            if (model1 == 'A') {
                leasePrice1 = 500;
                System.out.println("leasePrice1 = " + leasePrice1);
            } else {
                leasePrice1 = 400;
                System.out.println("leasePrice1 = " + leasePrice1);
            }
        }else{

        }
    }
}
