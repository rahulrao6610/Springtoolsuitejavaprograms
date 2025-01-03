import java.util.*;
public class Ownsplitter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter data");
		String data = sc.nextLine();
		//String data = "welcome to Full stack Development. Good Morning Hyderabad.";
		String words[] = data.split(" ");	
		int max =0;
		String maxStr = "";
		for(int i=0;i<words.length;i++) {
			if(words[i].contains(".")) {
				// 14
				words[i] = words[i].substring(0,words[i].length()-1 );
				System.out.println(words[i]);
			}
			if(words[i].length() > max) {
				max = words[i].length();
				maxStr = words[i];
			}
		}
		System.out.println("Max char in a Given Line--->"+max);
		System.out.println("Max Word in a Given Line--->"+maxStr);
	}
}
/*enter data
wellcome to full stack development
Max char in a Given Line--->11
Max Word in a Given Line--->development
*/
