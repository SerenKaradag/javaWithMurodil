package day28_loops;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases = 0;

          for(int day = 0; day<= 30; day++){
              if(day % 7 == 0){
                  totalCases += 500;
              }else{
                  totalCases += 200;
              }

              totalCases += 200;
              System.out.println("Day "+ day + " | total cases"+ totalCases);
          }

        System.out.println("javaCity 11/2021 Total Cases: "+ totalCases);
    }
}
