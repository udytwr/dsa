package Algorithms.SortingAlgorithms;

/*
    - Merge Sort Algorithm in Java!
    - Modified on 2-4-23
*/

import java.util.Arrays;

public class MergeSort_InPlace {

    public static void mergeSort(int[] arr, int l, int h) {
        if (h - l > 0) {

            int m = l + (h - l)/2;

            mergeSort(arr, l, m);
            mergeSort(arr, m+1, h);

            mergeArr(arr, l, m, h);
        }
    }

    private static void mergeArr(int[] arr, int l, int m, int h) {

        int[] mix = new int[(h - l)+1];

        int s = l;
        int md = m+1;
        int k = 0;

        while (s < m+1 && md <= h)  {
            if (arr[s] < arr[md]) {
                mix[k] = arr[s];
                s++;
            } else {
                mix[k] = arr[md];
                md++;
            }
            k++;
        }

        while (s < m+1) {
            mix[k] = arr[s];
            s++;
            k++;
        }

        while (md <= h) {
            mix[k] = arr[md];
            md++;
            k++;
        }

        for (int i = 0; i < mix.length; i++) {
            arr[l + i] = mix[i];
        }

    }

    public static void main(String[] args) {

        /*
         * -> Divide array into 2 parts.
         * -> Get both parts sorted via recursion.
         * -> Merge these sorted arrays.
         * -> Complexity analysis : At every level there are 'N' elements, and hence 'N' elements are being merged at every level, hence the time complexity for this sorting algorithm is O(N * log(N))
        */

        int[] arr = {35,50,15,25,80,20,90,45};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}