import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {


    public static void main(String[] args) {
        System.out.println(getDays());
        getDays().get(0);
        System.out.println("First value " + getDays().get(0));
        List<String> dayNames = getDays();
        //  PRINTING ALL DAYS
        System.out.println(getDays());

        dayNames.removeIf( day -> day.length() == 6 );
        System.out.println(dayNames);


        System.out.println(getRandomList(5));

        List<Integer> nums = getRandomList(100);
        System.out.println(nums.size()); // printing size 100
        System.out.println(nums); //printing count


        nums.removeIf(n -> n < 90); // remove less than 90 number
        System.out.println(nums); //after remove nums




    }


    public static List<String> getDays() {
      //  List<String> days = new ArrayList<>(Arrays.asList("monday, tuesday, wednesday, thursday,friday"));
        List<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");

        return days;
    }

    public static List<Integer> getRandomList(int size){
        Random random = new Random(); // new Random object
        List<Integer> nums = new ArrayList<>();

        for(int i =1; i <= size; i++){
            nums.add(random.nextInt(101));
          //  int n = random.nextInt();
          //  if(nums.contains(n)){
           //     nums.add(n);
           // }
            //FOR DUPLICATE

        }
          return nums;
    }
}
