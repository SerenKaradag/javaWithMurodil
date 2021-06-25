package day55_abstraction.interface_demo;

public interface MyInterface {
    public abstract void learn();
}

interface MyInterface2{
    // we can write more than one interface
}

class MyClass implements MyInterface, MyInterface2 {
    //WE NEED TO OVERRIDING.




    @Override
    public void learn() {

    }
}

class Main{
    public static void main(String[] args) {
      //  MyInterface myInterface = new MyInterface(); // ERROR BECAUSE INTERFACE CANNOT CREATE OBJECT OF INTERFACE
        MyClass myClass = new MyClass();
    }
}
