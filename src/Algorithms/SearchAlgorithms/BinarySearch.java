package Algorithms.SearchAlgorithms;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc;

        if(arr[start] > arr[end]) isAsc = false;
        else isAsc = true;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(target > arr[mid]) {
                if(!isAsc) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else if(target < arr[mid])

                if(!isAsc) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            else {
                return mid;
            }

        }

        return -1;
    }
 
    public static void main(String[] args) {
        int[] IntegerArray = {5678, 777, 89, 56, 22};
        System.out.println(binarySearch(IntegerArray, 56));
    }
}