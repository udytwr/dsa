package Algorithms.SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    
    public static int[] mergeSort(int[] arr) {

        if (arr.length == 1) return arr;

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) { // merge the left and right array!

        int[] Out = new int[left.length + right.length];
        
        int ls = 0, rs = 0, os = 0;

        while (ls < left.length && rs < right.length) {
            if (left[ls] < right[rs]) {
                Out[os] = left[ls];
                ls++;
            } else {
                Out[os] = right[rs];
                rs++;
            }
            os++;
        }

        while (ls < left.length) {
            Out[os] = left[ls];
            ls++;
            os++;
        }

        while (rs < right.length) {
            Out[os] = right[rs];
            rs++;
            os++;
        }

        return Out;

    }

    public static void main(String[] args) {

        /*
         * -> Divide array into 2 parts. 
         * -> Get both parts sorted via recursion.
         * -> Merge these sorted arrays.
         * -> Complexity analysis : At every levery there are 'N' elements, and hence 'N' elements are being merged at every level, hence the time complexity for this sorting algorithm is O(N * log(N))
        */


        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}
