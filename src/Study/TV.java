package Study;

public class TV {

    String name = "seren";
    int channel=1;
    int volumeLevel=0;
    boolean on = false;
    String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no args-constructor");

    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(channel > 0 && channel < 120){
            this.channel = channel;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp(){
        if(this.channel > 0 || this.channel < 120){
            this.channel++;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }

    }
    public void channelDown(){
        if(this.channel > 0 || this.channel < 120 || this.on == true){
            this.channel--;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }
    public void volumeUp(){
        if(this.volumeLevel < 7 || this.volumeLevel >0 || this.on == true){
            this.volumeLevel++;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }

    }
    public void volumeDown(){
        if(this.volumeLevel < 7 || this.volumeLevel >0 || this.on == true){
            this.volumeLevel--;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }
    public void turnOn(){
        if (this.on == true) {
            System.out.println("TV is already ON");
        }else{
            this.on=true;
        }
    }
    public void turnOff(){
        if(this.on == false){
            System.out.println("TV is already OFF");
        }else{
            this.on = false;
        }
    }
    public void isOn(){

    }


}
