package Study;
import day14_multi_branch_if_statements.YesOrNo;

import java.util.Scanner;



public class ParkingMeter {
    int timeLeft = 0;
    int maxTime;

    public ParkingMeter(int maxTime){
        this.maxTime = maxTime;
    }

    public boolean add(int prm) {

        if (prm == 25 && timeLeft <= maxTime) {
            this.timeLeft += 30;
            return true;
        } else {
            return false;
        }
    }
    public void tick () {

        if (timeLeft > 0) {
            timeLeft--;
        }

    }

    public boolean isExpired(){

        if(timeLeft == 0){
            return true;
        }
        return false;

    }
}
