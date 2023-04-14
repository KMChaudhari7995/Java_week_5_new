package java_week_5_new_Program;

import java.util.ArrayList;

/*
Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */
public class Programme_7_UnderGroundTubeNames {
    public void isEmpty(){
        ArrayList <String> tubeName = new ArrayList<>();
        tubeName.add("BakerLoo Lines");
        tubeName.add("Central Lines");
        tubeName.add("District Lines");
        tubeName.add("Piccadilly Lines");
        tubeName.add("Victoria Lines");
        tubeName.add("Jubilee Lines");

        System.out.println("Given Array list : "+ tubeName);
        if (tubeName.isEmpty()){
            System.out.println("Given Array list is Empty! ");

        }else {
            System.out.println("Given Array list is not empty ");

        }

    }

    public static void main(String[] args) {
        Programme_7_UnderGroundTubeNames obj = new Programme_7_UnderGroundTubeNames();
        obj.isEmpty();
    }
}
