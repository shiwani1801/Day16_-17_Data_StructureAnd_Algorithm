package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        String[] array = {"apple", "grapes", "kiwi", "mango", "pineapple"};
        Scanner sc = new Scanner(System.in);
        System.out.println("{ apple,grapes,kiwi,mango,pineapple } \nchoose a fruit from the above list");
        String searchString = sc.next();
        int result = binarySearch(array, searchString);
        if (result == -1)
            System.out.println("Fruit name not found in the list ....try again");
        else
            System.out.println("Fruit name found at the index " + result);
    }
    static int binarySearch(String[] array, String searchString) {
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // formula to find mid point
            int result = searchString.compareTo(array[mid]);
            // Check whether the entered element ie,searchString is present at mid point
            //ie,compareTo method returns O if both strings are equal
            if (result == 0)
                return mid;
            // If entered element ie,searchString is greater, ignore left half
            if (result > 0)
                low = mid + 1;//ignoring left half by assigning value for low as mid+1, so only elements in right part remains

                // If entered element ie,searchString is smaller, ignore right half
            else
                high = mid- 1;// ignoring right half by assigning value of high as mid-1, so only elements in left part remains
        }

        return -1;// returning -1 to access element at index 0

    }

}
