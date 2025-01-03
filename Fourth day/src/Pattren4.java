
public class Pattren4 {
/** ********************
	*                  *
	*                  *
	*                  *
	*                  *
	*                  *
	*                  *
	*                  *
	******************** **/
	public static void main(String[] args) {
		for(int r=1;r<=10;r++) {
			System.out.print("\t");
			if(r==1||r==10) {
				for(int c=1;c<=20;c++) {
					System.out.print("*");
				}
			}
				else {
					for(int c=1;c<=20;c++) {
						if(c==1||c==20) {
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
				}
					System.out.println();
				
			}
		}
	}
	}
