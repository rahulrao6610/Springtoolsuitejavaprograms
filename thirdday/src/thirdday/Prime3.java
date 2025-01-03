package thirdday;

public class Prime3 {
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		System.out.print("Prime numbers containing the digit 3: ");
        for (int num = 1; num <= 100; num++) {
            if (isPrime(num) && String.valueOf(num).contains("3")) {
                System.out.print(num + " ");
            }
        }
    }
}
