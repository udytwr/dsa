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
        System.out.println(D.setMe);
        D.greet();

        D = new Demo(); // Reinitialized with a different address in heap
        System.out.println(D.setMe);
    }
}