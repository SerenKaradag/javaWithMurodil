package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo(); //static > constructor  // BOTH IS WORKING  //num=10 //num+=5  15
        StaticBlockDemo st2 = new StaticBlockDemo();  // constructor WORK NOT STATIC  //num+=5  // 20
        StaticBlockDemo st3 = new StaticBlockDemo();   // constructor WORK NOT STATIC  //num+=5  //25
        System.out.println(StaticBlockDemo.num);
    }
}
