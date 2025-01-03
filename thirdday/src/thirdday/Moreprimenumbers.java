package thirdday;
import java.util.Scanner;
public class Moreprimenumbers {
	public static void main(String[] args) {
		int start=0,end=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("entert the range");
		start=sc.nextInt();
		end=sc.nextInt();
		int p=0;
		int index=0;
		for(int i=start;i<=end;i++)
		{
			if(isPrime(i)==true) {
				p=i;
				index++;
				if(index == 13) {
					break;
				}
			}
		}
		System.out.println();
	}
private static boolean isPrime(int n) {
	int count=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0) count++;
	}
	if(count == 2) return true;
	else return false;
}
}
