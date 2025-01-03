public class Oddnum{

    public static void main(String[] args) {
        int n = 5;
        int res = factorial(n);
        System.out.println("Factorial: " + res);
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                System.out.println(i);
                result *= i;
            }
        }
        return result;
    }
}
