package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        String[] student = new String[5];
        student[0] = "12345";
        student[1] = "Seren";
        student[2] = "Karadag";
        student[3] = "B22";
        student[4] = "123-456-7890";
                               //0      1        2        3        4
        String[] student1= {"12345", "Seren", "karadag", "B22", "1234567890"};


        System.out.println("student1 id  = " +student[0]);
        System.out.println("student firstname = "+ student[1]);
        System.out.println("student lastName = "+ student[2]);
        System.out.println("student batch num = "+ student[3]);
        System.out.println("student mobile num = "+ student[4]);


        System.out.println("student data length: "+ student.length); // no parantehesis



        if(student.length == 5){
            System.out.println("data array has correct length");
        }else{
            System.out.println("data array has incorrect length");
        }


        if(student.length == student1.length){
            System.out.println("data arrays length match");
        }else{
            System.out.println("data arrays length mismatch");
        }


        System.out.println(student[1].toUpperCase() + " " + student[2].toUpperCase());

         // read mobile from array and store into variable
        String mobileNum = student[4];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("202"));

















    }
}
