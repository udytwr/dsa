package Algorithms.SortingAlgorithms;

import java.util.Arrays;

import Core_Java.SwapArray;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr, boolean inDesc) {

        for(int noOfPasses = arr.length; noOfPasses > 1; noOfPasses--) {

            for(int at = 1; at <= noOfPasses-1; at++) {

                if(inDesc) {

                    if(arr[at-1] < arr[at]) SwapArray.swapArray(arr, at, at-1);

                } else {

                    if(arr[at-1] > arr[at]) SwapArray.swapArray(arr, at, at-1);
                    
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] IntegerArray = {5678, 89, 56, 22, 878,324242,234324,23222,3444,0};
        System.out.println(Arrays.toString(bubbleSort(IntegerArray, false)));
    }
}