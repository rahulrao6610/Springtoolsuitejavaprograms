import java.util.*;
public class adiition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the day:");
		int day=sc.nextInt();
		switch(day) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			default:
				System.out.println("fri-sun");
		}
	}

}
