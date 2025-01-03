/*write a program to filter duplicate numbers*/
import java.util.Scanner;
public class Array {
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
	for(int i=0;i<num.length;i++) {
		for(int j=i+1;j<num.length;j++) {
			if(num[i]==num[j]) {
				System.out.println(num[i]+"");
			}
		}
	}
	}

}
