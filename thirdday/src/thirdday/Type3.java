package thirdday;

public class Type3 {
    static float usDollar() {
    	return 83.45f;
    }
    static float ukpound() {
    	return 120f;
    }
	public static void main(String[] args) {
		int dollar = 100;
		float rupees = usDollar() * dollar;
		System.out.println(rupees);
	}

}
