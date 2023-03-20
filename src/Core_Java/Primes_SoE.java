package Core_Java;

import java.util.ArrayList;

public class Primes_SoE {

    public static ArrayList<Integer> primes_soe(int num) {

        boolean[] prime_arr = new boolean[num+1];
        ArrayList<Integer> result = new ArrayList<>();

        int count = 2;
        while (count < num) {
            for (int i = count+1; i <= num-1; i++) {
                if ((i % count) == 0) {
                    prime_arr[i] = true;
                }
            }

            count++;
        }

        for (int i = 2; i < prime_arr.length-1; i++) {
            if (!prime_arr[i]) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(primes_soe(40));
    }
    
}