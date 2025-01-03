import java.util.Scanner;
public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name A&B" );
		String a=sc.next();
		String b=sc.next();
		System.out.println("before swapping");
		System.out.println("a-------->"+a);
		System.out.println("b-------->"+b);
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("after swapping");
		System.out.println("a-------->"+a);
		System.out.println("b-------->"+b);
	}
}
