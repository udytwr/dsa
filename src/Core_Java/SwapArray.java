package Core_Java;

public class SwapArray {
    
    public static void swapArray(int[] arr, int indexTo, int indexWith) {

        int temp = arr[indexWith];
        arr[indexWith] = arr[indexTo];
        arr[indexTo] = temp;

    }

    public static void main(String[] args) { }
}
