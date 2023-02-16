package Core_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FastIO {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String myString = br.readLine();
        System.out.println(myString);

        // Accepting non-char values :

        // int myNumber = Integer.parseInt(br.readLine()); 
        // float myFloat = Float.parseFloat(br.readLine());
        // double myDouble = Double.parseDouble(br.readLine());
        // long myLong = Long.parseLong(br.readLine());

        // Accepting Boolean values :

        // boolean myBool = Boolean.parseBoolean(br.readLine());
        // System.out.println(myBool);

    }
}