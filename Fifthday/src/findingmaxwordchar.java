import java.util.Scanner;
public class findingmaxwordchar {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the data:");
	String data=sc.nextLine();
	String words[]=data.split(" ");
    int max=0;
    String maxstr="";
    for(int i=0;i<data.length();i++) {
    	if(words[i].contains(".")) {
    	words[i]=words[i].substring(0,words[i].length()-1);
        System.out.println(words[i]);
    	}
    	if(words[i].length()>max) {
    		max=words[i].length();
    		maxstr=words[i];
    	}
    	System.out.println("max char in a Given line--->"+max);
    	System.out.println("max word in a given line--->"+maxstr);
    }
	}
}
