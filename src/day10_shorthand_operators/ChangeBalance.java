package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);

        balance = balance - baklava;
        System.out.println("balance after baklava = " + baklava);

        double kunefe = 44.45;
        System.out.println("kunefe = " + kunefe);
        balance = balance - kunefe;

        // second kunefe is 50% off. lets buy it

        kunefe = kunefe / 2;
        System.out.println("kunefe = " + kunefe);


        balance = balance - kunefe;

        System.out.println("balance after second kunefe = " + balance);
        
        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("plov = " + balance);

        double IcedTea = 3.0;
        System.out.println("IcedTea = " + IcedTea);
        //buy 4 iced teas and decrease balance
        balance = balance - IcedTea * 4;
        System.out.println("balance after 4 Iced teas = " + balance);

        System.out.println("returning baklava + " + baklava);
        balance = balance + baklava;
        System.out.println("balance after returning baklava");







    }
}
