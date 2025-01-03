import java.util.*;
public class RANDOM {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int mynum=(int)(Math.random()*100);
    int usernum=0;
     do {
    	 System.out.println("guess my number:");
    	 usernum=sc.nextInt();
     if(usernum==mynum) {
    	 System.out.println("woohoo you match:");
    	 break;
     }
     else if(usernum>mynum) {
    	 System.out.println("your number is greater then :");
     }
     else {
    	 System.out.println("your number is smaller");
     }
}while(usernum>=0);
     System.out.println("my number was:");
     System.out.println(mynum);
}
}