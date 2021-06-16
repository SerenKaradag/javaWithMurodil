package day54_abstraction;

public class Salad extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("mix all greens");
    }

    @Override
    public void serve() {
        System.out.println("Put into bowl, with fork");
    }
}
