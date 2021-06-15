package Study;

public class Carpet {
    public double width;
    public double length;
    public double unitPrice;
    public double totalPrice;
    public boolean isPersian;

    public void Carpet(){

        this.width = 300;
        this.length = 300;
        this.totalPrice = 200;
        this.isPersian = false;
        this.unitPrice = 0;
    }

    public void Carpet(double width, double length, double unitPrice,boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

        this.totalPrice = (width + length) * unitPrice;
        if(isPersian){
            this.totalPrice += 200;
        }
    }
}
