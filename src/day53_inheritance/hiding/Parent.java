package day53_inheritance.hiding;

public class Parent {
    public String name = "parent > Mike Smith";
    public void introduce1(){
        System.out.println("Hello I am " + name);
    }
}

//if extends has a inheritance
// if we have public is inheritance

class Child extends Parent{
   public String name = "child > Bob Smith";
   public void introduce2(){
       System.out.println("Hello I am " + name);
   }
}

class Runner{
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.introduce1();
        // we can not call introduce2 does not share with  PARENT
        // we can call introduce2 and introduce1 in CHILD OBJECT
        Child child = new Child();
        child.introduce1();
        child.introduce2();
    }
}
