package day48_constructor_static;

public class Customer {
    private String name; //
    private int id;

    //no Args Constructor
    public Customer(){
        //WE dont print anything this kind of classes
        // but just today
        System.out.println("No args constructor");
        name = "new customer";
        id = -1;
    }

    //add a Constructor where we can assign name and id


    public Customer(String name, int id) {
        this.name = name;  //setName(name)
        this.id = id;    // setId(id)
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
