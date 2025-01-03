import java.util.*;
public class Dowhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numbers=0;
		do {
			System.out.println("enter the number:");
			numbers=sc.nextInt();
			System.out.print("hhere is your number:");
			System.out.println(numbers);
		}while(numbers>=0);
		System.out.println("END");
	}

}
