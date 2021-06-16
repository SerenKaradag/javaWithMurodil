package day54_abstraction;

public class Pizza extends MenuItem {
    @Override
    public void prepare() {
        System.out.println("Strech the dough and put topping and cheese and bake it");
    }

    @Override
    public void serve() {
        System.out.println("Serve in a plate ");
    }
}
