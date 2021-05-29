package day48_constructor_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator.add(5,3);// add is static method , can be called using Classname.staticMethodName

       // Calculator.multiply(2, 4);// ERROR BECAUSE WE NEED TO INSTANCE NOT STATIC

        Calculator calculatorObject = new Calculator();
        calculatorObject.multiply(2,4);
        // STATIC METHOD CAN ALSO BE CALLED USING AN OBJECT
        calculatorObject.add(5, 10);
    }
}
