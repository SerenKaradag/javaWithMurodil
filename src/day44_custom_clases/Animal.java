package day44_custom_clases;

public class Animal {

    String type = "some animal";// variable

    public  void eat(){
        System.out.println("eating"); // behaviour
    }
    public  void eat(String food){
        System.out.println("eating" + food);
    }
    public void speak(){

        System.out.println("speak"); // behaviour
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.type = "eagle";// assign new value
        System.out.println(animal.type);
        animal.eat();
        animal.eat(" grass");
      //  Animal.eat() // WE NEED TO STATIC IF WE USE CLASS

        Animal cheetahObj = new Animal();
        cheetahObj.type = "cheetah";
        System.out.println("cheetahObj = " + cheetahObj.type);

    }
}
