package day43_list_custom_clases;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee(); // OBJECT 1
        emp1.name = "Seren ";
        emp1.jobTitle = "SDET";
        emp1.work();


        Employee emp2 = new Employee();
        emp2.name = "Ahmet ";
        emp2.jobTitle = "Full stack development";
        emp2.work();

        emp1.work();
        emp1 = emp2;
        emp1.work();
    }
}
