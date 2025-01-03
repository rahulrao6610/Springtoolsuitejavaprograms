package secondday;
import java.util.Scanner;
public class scanner {

public static void main(String[] args) {
	Scanner num=new Scanner(System.in);
	System.out.println("enter the number:");
	int n=num.nextInt();
	if((n>=0)&&(n<=9))
	{
		System.out.println("it is an numeric");
	}
	else
	{
		System.out.println("not an numeric");
	}
	}

}
