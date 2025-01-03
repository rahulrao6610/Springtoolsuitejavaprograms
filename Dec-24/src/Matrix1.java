import java.util.*;
public class Matrix1 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the rows:");
    int r=sc.nextInt();
    System.out.println("enter the columns:");
    int c=sc.nextInt();
    int [][]mat=new int[r][c];
    for(int rows=0;rows<r;rows++) {
		for(int cols=0;cols<c;cols++) {
			
			mat[rows][cols]= sc.nextInt();
		}
		
	}
	// print
	for(int rows=0;rows<r;rows++) {
		for(int cols=0;cols<c;cols++) {
			
			System.out.print(mat[rows][cols]+" ");
		}
		System.out.println();
	}
	}
}
