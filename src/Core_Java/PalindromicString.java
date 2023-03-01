package Core_Java;

public class PalindromicString {
    
    public static boolean isPalindrome(String str) {

        if (str == null || str.length() == 0) return false;

        char[] charArr = str.toCharArray();

        var s = 0;
        var e = charArr.length-1;

        while (s < e) {

            if (charArr[s] == charArr[e]) {

                s += 1;
                e -= 1;

            } else return false;

        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }

}
