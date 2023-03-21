package Core_Java;


public class Sqrt_NRM {

    public static double sqrt_nrm(double num) {

        double x = num;
        double root;

        while (true) {

            root = 0.5 * (x + num/x);
            double error = Math.abs(root - x);
            if (error < 1) break;
            x = root;

        }

        return root;
    }

    public static void main(String[] args) {
        System.out.println(sqrt_nrm(12));
    }
    
}