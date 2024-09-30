
public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Print the results of the arithmetic operations
        System.out.println("a + b is "+add(a, b));
        System.out.println("a * b is "+multiply(a, b));
        System.out.println("a - b is "+subtract(a, b));
        System.out.println("a/b is "+divide(a, b));
    }
}