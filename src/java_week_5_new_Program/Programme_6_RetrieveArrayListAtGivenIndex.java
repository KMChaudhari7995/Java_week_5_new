package java_week_5_new_Program;
/*
Write a Java program to retrieve an element (at a specified index) from a given array list
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Programme_6_RetrieveArrayListAtGivenIndex {
    public static void main(String[] args) {
        ArrayList <String> vegetables = new ArrayList<>();
        vegetables.add("Cucumber");
        vegetables.add("Onion");
        vegetables.add("Cauliflower");
        vegetables.add("Potato");
        vegetables.add("Beetroot");
        vegetables.add("Tomato");
        System.out.println(vegetables);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an index number : ");
        int index = scanner.nextInt();
        if (index <vegetables.size()){
            System.out.println(vegetables.get(index));
        }else {
            System.out.println("Invalid Index !! " );
        }
        scanner.close();

    }
}
