package Core_Java;

class Demo {

    int d1 = 69; // Instance Variable : Stored in Heap Memory
    int setMe = 0; // Instance Variable : Stored in Heap Memory 

    public void greet() { // Method : Called in Stack

        System.out.println("This is a Demo class!");

    }

    public void setter(int a) { // Setter Method with a local variable : 'a', which is stored in stack and the method is -> Called in Stack

        setMe = a; 

    }

}

public class ObjAllocation {

    public static void main(String[] args) {
 
        Demo D = new Demo();
        D.setter(3);
        System.out.println(D.setMe); // 3
        D.greet();

        Demo B = D;

        System.out.println(B.setMe); // 3 : Referencing to the same object as of 'D'!

        D = new Demo(); // Reinitialized with a different address in heap
        System.out.println(D.setMe); // 0
        
        D.setter(10);
        System.out.println(D.setMe); // 10
        System.out.println(B.setMe); // 3 : Since it is referencing to the same old object!

    }
}