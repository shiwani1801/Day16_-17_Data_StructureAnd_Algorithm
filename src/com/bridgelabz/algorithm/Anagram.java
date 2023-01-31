package com.bridgelabz.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        System.out.println("\n===========================Code to check whether two strings are anagrams================");
        System.out.println("enter the first string : ");
        Scanner sc = new Scanner(System.in);
        String firstString = sc.next();
        System.out.println("enter the second string : ");
        String secondString = sc.next();
        if (firstString.length() == secondString.length())
            anagramCheck(firstString, secondString);
        else
            System.out.println("The string lengths does not match ....Anagram strings will have same length");
    }

    public static void anagramCheck(String firstString, String secondString) {
        char[] first = firstString.toCharArray();
        char[] second = secondString.toCharArray();
        first = sorting(first);
        second = sorting(second);
        boolean result= Arrays.equals(first,second);
        if(result==true)
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are Not anagrams");

    }

    public static char[] sorting(char[] array) {
        char temp;
        int i = 0;
        while (i < array.length) {
            int j = i + 1;
            while (j < array.length) {
                if (array[j] < array[i]) {

                    // Comparing the characters one by one
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
            i++;
        }
        System.out.println(array);
        return array;
    }
}
