import java.util.Scanner;
public class Bubblesort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("enter the elements");
		for(int m=0;m<size;m++) {
			num[m]=sc.nextInt();
		}
		int t;
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					t=num[i];
					num[i]=num[j];
					num[j]=t;
				}
			}
		}
		for(int k=0;k<num.length;k++) {
			System.out.println(num[k]+" ");
		}
	}
	/*enter the size of array:
6
enter the elements
30
45
6
0
3
4
0 
3 
4 
6 
30 
45 */

}
