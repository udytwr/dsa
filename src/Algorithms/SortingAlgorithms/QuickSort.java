package Algorithms.SortingAlgorithms;

/*
    - Quick Sort Algorithm in Java!
    - Modified on 2-4-23
*/

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int arr[], int l, int h) {

        if (h - l > 0) {

            int p = partitioner(arr, l, h);

            quickSort(arr, l, p-1);
            quickSort(arr, p+1, h);
        }

        return;
    }

    public static int partitioner(int arr[], int l, int h) {

        int p = l+1;
        int q = h;

        while(p < q) {

            while (arr[p] < arr[l] && p < q) {
                p++;
            }

            while (arr[q] >= arr[l] && q >= p) {
                q--;
            }

            if (p < q) {
                swap(arr, p, q);
            }
        }

        if (arr[l] > arr[q]) {
            swap(arr, l, q);
        }
        return q;
    }

    public static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {

        /*
         * -> Have to choose an element known as pivot, we have sort the array in such a way that all the elements < pivot will be on th LHS of the pivot and all the elements > p will be RHS of pivot!
         * -> How to put pivot at the correct index := just check the start and end elements with respect to pivot element and swap them if any violations occurs!
         * -> How to pick the pivot element? -> 1. Pick a random element, 2. Pick corner element, 3. Pick middle element.
         * -> Worst case : When you have one side of recursive array is empty(Choosing pivot element having largest or smallest value!).
         * -> Best case : When you have equal sides of recursive array(Choosing pivot element of mid-value).
         * -> Not a Stable-SortAlgorithm!
        */
        
        int[] arr = {35,50,15,25,80,20,90,45};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}