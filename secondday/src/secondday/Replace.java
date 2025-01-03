package secondday;

public class Replace {

	public static void main(String[] args) {
		        int n = 3999, rem, d=1, repIndex = 2, newDig = 7,digitct=0,original=n;
		        while (n / d >= 10) {
		            d = d * 10;
		        }
		        int temp = n;
		        while (temp > 0) {
		            digitct++;
		            temp =temp/ 10;
		        }
		        n = original;
		        int pos = digitct - repIndex + 1;
		        int divisor = (int) Math.pow(10, pos - 1);
		        n = n - ((n / divisor % 10) * divisor) + (newDig * divisor);
		        System.out.println("Modified order:");
		        while (d > 0) {
		            rem = n / d; 
		            System.out.println(rem);
		            n = n % d;
		            d = d / 10;
		        }
		    }
		}
