package secondday;

public class Afterbreak2 {

	public static void main(String[] args) {
		 int n = 3999,rem,d;
	         d = 1;
	        while (n /d >= 10) {
	            d=d* 10;
	        }

	        System.out.println("Original order:");
	        while (d > 0) {
	            rem = n / d; 
	            System.out.println(rem);
	            n = n % d;       
	            d = d / 10;
		}
	}

}
