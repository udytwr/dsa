package Algorithms.SortingAlgorithms;

import java.util.Arrays;

public class MergeSort_InPlace {
    
    public static void mergeSortInPlace(int[] arr, int s, int e) {

        if (e - s == 1) return;

        int mid = (s + e)/2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int mid, int e) {

        int[] Out = new int[e - s];

        int i = s, j = mid, os = 0;

        
        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                Out[os] = arr[i];
                i++;
            } else {
                Out[os] = arr[j];
                j++;
            }
            os++;
        }

        while (i < mid) {
            Out[os] = arr[i];
            i++;
            os++;
        }

        while (j < e) {
            Out[os] = arr[j];
            j++;
            os++;
        }

        for (int l = 0; l < Out.length; l++) {
            arr[s+l] = Out[l];
        }

    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
