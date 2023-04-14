package java_week_5_new_Program;

import java.util.ArrayList;

public class Programme_11_CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Blue");
        c1.add("Pink");
        ArrayList<String > c2 = new ArrayList<>();
        c2.add("Yellow");
        c2.add("Blue");
        c2.add("Pink");

        //storing the comparison output in Arraylist<String>
        ArrayList<String> c3 = new ArrayList<>();
        for (String e: c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);
    }
}
