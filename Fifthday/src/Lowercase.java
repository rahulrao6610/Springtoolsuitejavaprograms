import java.util.Scanner;

public class Lowercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the data");
		String data="WELCOMETOJAVAPROFRAM";
		data=data.toLowerCase();
		int [] count= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		char ch=' ';
		int index;
		for(int i=0;i<data.length();i++) {
			ch=data.charAt(i);
			if(ch>='A'&& ch<='Z') {
				index=(int)(ch-95);
				count[index]++;
			}
		}
		for(int i=0;i<26;i++) {
			if(count[i]>0)
			System.out.println("["+(char)(i+65)+"]---->"+count[i]);

	}
	}
}
	
