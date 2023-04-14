package java_week_5_new_Program;

import java.util.HashMap;
import java.util.Map;

/*
Create a HashMap object called people that will store String keys and Integer values:
 */
public class Programme_9_Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> peopleNumber = new HashMap<>();
        //Add keys and value (name , id)
        peopleNumber.put("Monday ",101);
        peopleNumber.put("Tuesday ",102);
        peopleNumber.put("Wednesday ",103);
        peopleNumber.put("Thursday ",104);
        peopleNumber.put("Friday ",105);
        peopleNumber.put("Saturday ",106);
        peopleNumber.put("Sunday ",107);

        for (Map.Entry<String,Integer > peopleNum :
            peopleNumber.entrySet() ) {
            System.out.println(peopleNum.getKey() + "= " + peopleNum.getValue());
        }
    }
}
