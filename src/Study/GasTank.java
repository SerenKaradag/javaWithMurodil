package Study;

public class GasTank {

    double amount = 0;
    double capacity;

    public GasTank(double capacity){

    }
    public void addGas(double addGasParameter){
        this.amount += addGasParameter;
        if(this.amount >= this.capacity){
            this.capacity = this.amount;
        }
    }
    public void useGas(double useGasParameter){
        this.amount -= useGasParameter;

        if(this.amount <= 0){
            this.amount = 0;
        }
    }

    public boolean isEmpty(){

        if(this.amount < 0.1 ){
            return true;
        }else
            return false;
    }

    public boolean isFull(){
        if(this.amount > (-0.1)){
            return true;
        }else
            return false;
    }
    public double getGasLevel(){
        return this.amount;
    }
    public double fillUp(){
        double needed;
        needed = this.capacity - this.amount;
        return needed;
    }

}
