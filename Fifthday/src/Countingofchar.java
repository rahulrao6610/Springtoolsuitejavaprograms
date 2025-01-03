import java.util.*;
public class Countingofchar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the data");
		String data="welcometojavaprogram";
		data=data.toUpperCase();
		int [] count= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		char ch=' ';
		int index;
		for(int i=0;i<data.length();i++) {
			ch=data.charAt(i);
			if(ch>='A'&& ch<='Z') {
				index=(int)(ch-65);
				count[index]++;
			}
		}
		for(int i=0;i<26;i++) {
			if(count[i]>0)
			System.out.println("["+(char)(i+65)+"]---->"+count[i]);
		}
	}
}
/*enter the data
[A]---->2
[C]---->1
[D]---->1
[E]---->2
[J]---->1
[L]---->2
[M]---->1
[O]---->3
[R]---->1
[T]---->1
[V]---->1
[W]---->2*/
