package Batch23.day58_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {
        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Seren", 100000);
        employeeMap.put("Dilem", 100000);
        employeeMap.put("Seren", 100000);// KEY CAN NOT BE DUPLICATED
        employeeMap.put("Ahmet" , 100000);
        employeeMap.put("John", 120000);

        System.out.println(employeeMap);
       int n1 =  employeeMap.get("Ahmet");
        System.out.println(n1);

        System.out.println("-----------------------------------------------------");
        System.out.println(employeeMap);
        employeeMap.remove("John");
        System.out.println(employeeMap);

        boolean r1 = employeeMap.containsKey("Muhtar"); // false
        boolean r2 = employeeMap.containsKey("John"); // false its already remove it
        boolean r3 = employeeMap.containsKey("Seren");


        System.out.println("r1 = " + r1);

        System.out.println("r2 = " + r2);

        System.out.println("r3 = " + r3);

        boolean r5 = employeeMap.containsValue(100000);
        System.out.println("r5 = " + r5);

        System.out.println("================================");

        System.out.println(employeeMap);

        employeeMap.replace("Selda", 120000);
        System.out.println(employeeMap);

        employeeMap.replace("Ahmet", employeeMap.get("Ahmet") + 50000);
        System.out.println(employeeMap);


        //iterate

        for (String eachName : employeeMap.keySet()) {
            System.out.println(eachName);

        }

        System.out.println("------------------------------------------------");


        for (Map.Entry<String, Integer> eachEntry : employeeMap.entrySet()) {
            System.out.println(eachEntry.getKey() + ": " + eachEntry.getValue());
        }

        System.out.println(employeeMap);


        System.out.println("----------------------------------------------------");

        //find the max salary print the name of employee(s) who have the max salary
        int max = Integer.MIN_VALUE;
        String name = "";

        for(Map.Entry<String, Integer> entry : employeeMap.entrySet()){
            String eachName = entry.getKey();
            Integer eachSalary = entry.getValue();

            if(eachSalary > max){
                max = eachSalary;
                name = eachName;
            }
        }

        System.out.println("max = " + max);
        System.out.println("name = " + name);

    }
}
