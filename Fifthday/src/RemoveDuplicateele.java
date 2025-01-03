import java.util.*;
public class RemoveDuplicateele {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Data:");
	String data=sc.nextLine();
	data=data.toUpperCase();
	int [] count= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	char ch=' ';
	int index;
	String result="";
	for(int i=0;i<data.length();i++) {
		ch=data.charAt(i);
		if(ch>='A'&& ch<='Z') {
			index=(int)(ch-65);
			count[index]++;
			if(count[index]==1) {
				result=result+ch;
			}
		}
	}
		System.out.println("result------>"+result);
 }
}
/*enter the Data:
welcome to full stack development
result------>WELCOMTFUSAKDVPN*/
