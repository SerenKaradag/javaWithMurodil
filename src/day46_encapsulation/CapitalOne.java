package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(43526845236958L);
        acc.setBalance(250.50);
        acc.setAccountHolder("Mike Smith");
        acc.setType("Capital One");

        System.out.println();
    }
}
