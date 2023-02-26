package Core_Java;

public class CopyChars {

    public static void main(String[] args) {

        String str = "Hello, World this is java";
        char[] charArr = new char[10];

        // copies charcters from string : str from index 3 to 9 in array : charArr from the index 0 :
        
        str.getChars(3, 10, charArr, 0);
        System.out.println(charArr);
        
    }
}