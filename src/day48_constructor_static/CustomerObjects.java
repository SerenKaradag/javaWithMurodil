package day48_constructor_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1); // print with default values that are set in  no-args constructor
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer ("Mike", 2); // create object and assign values in same statement
        Customer cs3 = new Customer("Seren Karadag", 905);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of Customer
        Customer[] todaysCustomer = {cs1, cs2, cs3, new Customer("Bashir", 449)};

        //arrayList of Customer object
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir", 500));

        System.out.println(todaysCustomer[0].toString());
        System.out.println(customerList.get(0).toString());


        System.out.println(customerList.toString()); // print to.String all object

        for(int i=0;  i < customerList.size();i++){
            System.out.println(customerList.get(i));
        }

        System.out.println("------------FOR EACH LOOP--------------");
        for(Customer eachCustomer : customerList){
            System.out.println(eachCustomer);
        }

        //print only names of Customers in the list
        System.out.println("--------Names of customer----------"); //LAMBADAAA LOOP
        customerList.forEach(each -> System.out.println(each.getName()));

    }
}
