package secondday;

public class Example2replace {

	public static void main(String[] args) {
		int n = 3999, d = 1, repIndex = 2, newDig = 7, original = n;
        while (n / d >= 10) d *= 10;
        int pos = Integer.toString(original).length() - repIndex;
        int divisor = (int) Math.pow(10, pos);
        n = original - ((original / divisor % 10) * divisor) + (newDig * divisor);

        System.out.println("Modified order:");
        while (d > 0) {
            System.out.println(n / d);
            n %= d;
            d /= 10;
        }
    }

	}

