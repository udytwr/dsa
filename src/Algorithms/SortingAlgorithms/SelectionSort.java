package Algorithms.SortingAlgorithms;

import java.util.Arrays;

import Core_Java.SwapArray;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        
        for (int noOfPasses = arr.length; noOfPasses > 1; noOfPasses--) {

            int maxElem = 0;
            int maxIndex = 0;

            for (int ele = 0; ele <= noOfPasses-1; ele++) {
                
                if (arr[ele] >= maxElem) {
                    maxElem = arr[ele];
                    maxIndex = ele;
                }

            }
            
            SwapArray.swapArray(arr, noOfPasses-1, maxIndex);
        }

        return arr;
    }


    public static void main(String[] args) {

        /*
         * -> Select a element and put it its right index 
         * -> Complexity analysis : max compariosns = n-1 (n : no of elements in the array)
         * -> These no of comparisons will be decremented by 1 in every step of sorting and hence leads to the a complexity of O(n^2)! <- also the best case
         * -> Perform well in small values of n
         * -> Unstable sorting algorithm...
        */

        int[] IntegerArray = {0,2678,-1,8,8,55,23445,90,65,34};
        System.out.println(Arrays.toString(selectionSort(IntegerArray)));
        
    }    
}