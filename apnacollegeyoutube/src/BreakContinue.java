import java.util.*;
public class BreakContinue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int  i=sc.nextInt();
	while(true) {
		System.out.println(i);
		i=i--;
		if(i>=8) {
			break;
		}
	}
}
}
