package Algorithms.SortingAlgorithms;

import java.util.Arrays;

import Core_Java.SwapArray;

public class CyclicSort {
    
    public static int[] cyclicSort(int[] arr) {

        int counter = 0;
        while(counter < arr.length) {

            int c_index = arr[counter] - 1;

            if (arr[c_index] != arr[counter]) SwapArray.swapArray(arr, c_index, counter);
            else counter++;

        }

        return arr;
    }

    public static void main(String[] args) {
        
        /*
         * -> Used when a array has elements from 1 to N : Relation betweem value and index => index = value - 1
         * -> Complexity analysis : Worst Case => O(n)
        */

        int[] IntegerArray = {3,5,2,1,4};
        System.out.println(Arrays.toString(cyclicSort(IntegerArray)));
    }
}
