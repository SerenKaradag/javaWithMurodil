package Study;

public class TV {

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
        this.channel = channel;
    }

    public int getVolumeLevel(){
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
        this.channel++;
    }
    public void channelDown(){
        this.channel--;
    }
    public void volumeUp(){
        this.volumeLevel++;
    }
    public void volumeDown(){
        this.volumeLevel--;
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
        if(this.channel > 0 || this.channel < 120){

        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
        if(this.volumeLevel <= 7 || this.volumeLevel >=0){

        }else if(!on == true){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }


    }
