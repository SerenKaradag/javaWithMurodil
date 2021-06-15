package day52_inheritance;

public class Instagram  extends MobileApp{
    public void postPhoto(){
        System.out.println("Posting photo to Instagram");
    }


    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        postPhoto();
    }
}
