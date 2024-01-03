package dsa;

public class Factorial {

    public static int fact(int n) {
        if (n == 0) { return 1; }
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println("The factorial of n is: " + fact(n));
    }
}
