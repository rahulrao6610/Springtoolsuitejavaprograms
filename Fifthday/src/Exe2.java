import java.util.Scanner;
public class Exe2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the long number:");
	long num=sc.nextLong();
	long r;
	int[] count= {
			0,0,0,
			0,0,0,
			0,0,0,0
	};
while(num!=0) {
	r=num%10;
	num=num/10;
	count[(int)r]++;
}
for(int c=0;c<10;c++) {
	/*if(count[c]>0)*/if(count[c]==0)/*if we wan to remove the dulipcate values
		we can use this logic*/ 
		System.out.println(c+" of elements--->"+count[c]);
	//sysout(
}
	}
}
/* enter the long number:
121003487891
0 of elements--->2
1 of elements--->3
2 of elements--->1
3 of elements--->1
4 of elements--->1
7 of elements--->1
8 of elements--->2
9 of elements--->1*/