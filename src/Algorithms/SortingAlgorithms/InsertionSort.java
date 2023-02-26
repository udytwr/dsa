package Algorithms.SortingAlgorithms;

import java.util.Arrays;

import Core_Java.SwapArray;

public class InsertionSort {

    public static int[] insertionSort(int[] arr) {

        for (int noOfPasses = 0; noOfPasses <= arr.length - 2; noOfPasses++) {  // No of passes : arr.length - 1          

            for (int at = noOfPasses + 1; at > 0; at--) { // swapper loop will run from noOfPass + 1 to index 1
                
                if (arr[at-1] <= arr[at]) {
                    break;
                } else SwapArray.swapArray(arr, at, at-1);
            }

        }

        return arr;
    }
    
    public static void main(String[] args) {
        
        /* 
         * -> Kind of reversed bubble sort!
         * -> Complexity Analysis : Worst Case -> O(n^2), Best Case -> When array is already sorted = O(n) | Where n is length of the given array
         * -> Benefits : No of swaps are reduced because of break statements
         * -> Used for smaller values of n, works well in a partially sorted array => used in hybrid sorting algorithm
         * -> Stabe sorting algorithm...
        */

        int[] IntegerArray = {0,2678,-1,8,8,55,23445,90,65,34};
        System.out.println(Arrays.toString(insertionSort(IntegerArray)));
    }
}