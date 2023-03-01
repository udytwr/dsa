package Core_Java;

public class MutableStrings {

    // String Pool : String pool is a special section of memory in the heap which is used to store strings in heap with more optimised manner! 

    public static void main(String[] args) {
    
        String a = "Hello"; // a --> 'Hello' 0x1
        String b = "Hello"; // b --> 'Hello' 0x1

        /* a <-> b will be refrenced to the same object "Hello" */  

        /*
         * Strings are immutable by default!
        */

        b = "UwU"; // The old refrence of b -> 'Hello' will be destroyed and a new refrence to 'UwU' is created! : b -> 'UwU'
        System.out.println(a); // Still a -> 'Hello'
        System.out.println(b); // b -> 'UwU'

        System.out.println(a.equals(b)); // false since both the value and refernce are different!

        /*  String Comparison : '==' method -> checks for both value and address or refrence
                        '.equals()' -> checks for only value! 
        */         

        String A = "Hello";
        String B = new String("Hello"); // Creates a new object irrespective to the same object which is already present in the pool!

        System.out.println(A == B); // false since refrence is not same!
        System.out.println(A.equals(B)); // true since value is same!

    }
    
}