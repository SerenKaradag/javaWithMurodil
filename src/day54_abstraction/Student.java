package day54_abstraction;
/**
We add abstract keyword
 We can not create object of STUDENT ABSTRACT CLASS
 */
public abstract class Student {

    public void code(String language){
        System.out.println("Student is coding " + language);
    }


    public abstract void attendClass(); // THERE IS NO BODY
    // RESPONSIBILITY TO SUB OR CHILD CLASS
    //IMPLEMENTING FROM SUB CLASS
}
