package day37_method_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10, 5);
        addNumbers(100, 200, 300);
        addNumbers(25,45,32,5412,512,512,54,87,898,623,20,1,3543,5,23,0,32,3654,3,1235,4135,41);
        addNumbers();
        //int... myNumber = 10, 4; ERROR, var-args can ONLY be used as a method parameter





    }



    //varargs
    public static void addNumbers(int... nums) {
                               // 0 or more means ...
        //inside the method, it is used as regular array
     //   int sum = 0;
      //  for(int n : nums) {
      //      sum += n;
      //  }
     //   System.out.println("sum = " + sum);

        int sum =0;
        for(int n : nums){
            sum += n;
        }
        System.out.println("sum = "+ sum);
    }
}
