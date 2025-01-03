package thirdday;
import java.util.Scanner;
public class Primeno {
    public static boolean isPrime(int n) {
    	int i=2;
    	for(;i<n/2 &&(n%i!=0);i++);
    	if((n/2)==i)return true;
    	else return false;
    	
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int n=sc.nextInt();
		if(isPrime(n)==true)System.out.println("is prime");
		else System.out.println("not prime");
			
		}

	}