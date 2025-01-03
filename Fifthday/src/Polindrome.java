import java.util.Scanner;
public class Polindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the data");
	String data=sc.next();
	char ch;
	String newstr="";
	for(int i=data.length()-1;i>=0;i--) {
		ch=data.charAt(i);
		newstr=newstr+ch;
	}
	System.out.println("data from keyboard--->"+data);
System.out.println("new str---->"+newstr);
if(data.contentEquals(newstr)==true) {
	System.out.println("polindrome");
}else {
	System.out.println("not a polindrome");
}
	}

}
