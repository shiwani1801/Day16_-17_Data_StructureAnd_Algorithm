package com.bridgelabz.algorithm;

public class InsertionSort {
    public void sort(String array[])
    {
        //Insertion sort
        for(int i=1 ; i<array.length; i++)
        {
            String temp = array[i];
            int j = i-1;
            while(j>=0 && array[j].compareTo(temp)>0)
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1]=temp;
        }
    }

    public static void main(String[] args)
    {
        String array[] = {"pineapple","grapes","apple", "kiwi", "mango"};
        InsertionSort obj = new InsertionSort();
        System.out.println("Before sorting");
        for(String elements: array)
        {
            System.out.print(elements+" ");
        }
        System.out.println();

        System.out.println("After sorting");
        obj.sort(array);

        //print array elements
        for(String elements: array)
        {
            System.out.print(elements+" ");
        }
    }

}
