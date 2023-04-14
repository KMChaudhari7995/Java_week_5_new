package java_week_5_new_Program;

import java.util.Arrays;

/*
Write a Java program to reverse an array of integer values

 */
public class Programme_3_ReverseArray {
    public static void main(String[] args) {
        int [] array = new int[] {23,45,34,54,67,78}; //Single dimensional Array
        System.out.println("Original Array: "+Arrays.toString(array));
        Programme_3_ReverseArray obj = new Programme_3_ReverseArray();
        System.out.println("Reverse Array : " );
        obj.reverseArray(array);
    }

    //method to reverse an array
    public void reverseArray(int [] list){
        for(int i = 0; i<(list.length)/2 ; i++){
            int temp = list[i];
            list[i] = list[list.length - 1 -i];
            list[list.length - 1- i ]= temp;
        }
        System.out.println(Arrays.toString(list));
    }
}
