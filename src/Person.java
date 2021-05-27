public class Person {

    String firstName; //DATA
    int age; //DATA
    char gender; // DATA
    //behaviour -> method
    public void speak() { // BEHAVIOUR
        System.out.println("Person is speaking");
    }
}


class People{
    public static void main(String[] args) {
        //create object of Person class - instantiate
        Person person1 = new Person();
        person1.firstName = "Bob";
        person1.age = 33;
        person1.gender = 'F';

        person1.speak(); // BEHAVIOUR
        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        Person person2 = new Person();
        person2.firstName = "Mike";
        person2.age = 25;
        person2.gender = 'M';
        person2.speak(); // BEHAVIOUR

        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.gender);

      //  System.out.println(person1.firstName); // Still same person1


    }
}
