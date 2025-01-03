package thirdday;

public class Primenum {
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
		        System.out.print("Prime numbers between 1 and 100 with two digits: ");
		        for (int num = 10; num < 100; num++) {
		            if (isPrime(num)) {
		                System.out.print(num + " ");
		            }
		        }
	}
}

