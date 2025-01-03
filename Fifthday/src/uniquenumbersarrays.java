/*write a program uniquenumbers array*/
import java.util.Scanner;
public class uniquenumbersarrays {
	public static void main(String[] args) {
	int[]num;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	num=new int[size];
	System.out.println("enter all"+size+"numbers");
	for(int p=0;p<size;p++) {
		num[p]=sc.nextInt();
	}

	}

}
