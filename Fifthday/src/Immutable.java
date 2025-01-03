
public class Immutable {

	public static void main(String[] args) {
		String name1="hello";
		String name2="hello";
		if(name1==name2) {
			System.out.println("having the same content");
		}
			else{
				System.out.println("they are not same");
			}
		String data3=new String("hello");
		String data4=new String("hello");
		if(data3==data4) {
			System.out.println("from new same");
		}
		else {
			System.out.println("from new not");
		}
			}
		}


