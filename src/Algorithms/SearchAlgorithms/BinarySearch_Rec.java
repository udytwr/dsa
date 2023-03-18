package Algorithms.SearchAlgorithms;

public class BinarySearch_Rec {
    
    public static int binarySearch_Rec(int[] arr, int target, int start, int end) {

        if (start > end) return -1;

        int mid = start + (end - start)/2;

        if (target > arr[mid]) return binarySearch_Rec(arr, target, mid+1, arr.length-1);
        if (target < arr[mid]) return binarySearch_Rec(arr, target, 0, mid-1);

        return mid;

    }

    public static void main(String[] args) {
        int[] IntegerArray = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch_Rec(IntegerArray, 7,0,8));
    }
}
