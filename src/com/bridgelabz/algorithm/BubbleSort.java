package com.bridgelabz.algorithm;

public class BubbleSort
{
    public void bubbleSort(int array[])
    {
        int n = array.length;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(array[j] > array[j+1])
                {
                    //Swapping adjacent elements
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int array[] = {34,23,2,12,45,33};
        BubbleSort obj = new BubbleSort();
        System.out.println("Before sorting");
        for(int elements: array)
        {
            System.out.print(elements+" ");
        }
        System.out.println();

        obj.bubbleSort(array);
        System.out.println("after sorting");
        //print array elements
        for(int elements: array)
        {
            System.out.print(elements+" ");
        }

    }

}