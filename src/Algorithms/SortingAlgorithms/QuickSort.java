package Algorithms.SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    
    public static void quickSort(int[] nums, int l, int h) {

        if (l >= h) {
            return;
        }
        
        int s = l;
        int e = h;
        int m = s + (e - s)/2;

        int pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }

            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(nums, l, e);
        quickSort(nums, s, h);

    }
    

    public static void main(String[] args) {
        
        /*
         * -> Have to chose a element known as pivot, we have sort the array in such a way that all the elements < pivot will be on th LHS of the pivot and all the elements > p will be RHS of pivot!    
         * -> How to put pivot at the correct index := just check the start and end elements with respect to pivot element and swap them if any violations occurs!
         * -> How to pick the pivot element? := 1. Pick a random element, 2. Pick corner element, 3. Pick middle element.
         * -> Worst case : When you have one side of recursive array is empty(Choosing pivot element having largest or samllest value!). 
         * -> Best case : When you have equal sides of recursive array(Choosing pivot element of mid value).
         * -> Not a Stable-SortAlgorithm! 
        */

        int[] arr = {5,4,3,2,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
