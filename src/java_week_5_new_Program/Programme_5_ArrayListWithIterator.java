package java_week_5_new_Program;

import java.util.ArrayList;
import java.util.ListIterator;

/*
Write a Java program to iterate through all elements in an array list using Iterator
 */
public class Programme_5_ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Grape");
        fruitList.add("Banana");
        fruitList.add("kiwi");
        fruitList.add("Mango");
        fruitList.add("Cherry");
        fruitList.add("Pineapple");

        ListIterator<String> iterate = fruitList.listIterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next() + ", ");
        }
    }
}
