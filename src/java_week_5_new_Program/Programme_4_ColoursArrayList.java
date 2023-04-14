package java_week_5_new_Program;

import java.util.ArrayList;

/*
Write a Java program to create a new array list, add some colours (string)
and printout the collection using for each loop.
 */
public class Programme_4_ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("White");
        colorList.add("BLue");
        colorList.add("Pink");
        colorList.add("Black");
        colorList.add("Orange");
        colorList.add("Yellow");
        colorList.add("Sky blue");

        for (String colourList: colorList) {
            System.out.println(colourList+ ",");
        }
    }
}
