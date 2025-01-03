
public class Pattren5 {

	public static void main(String[] args) 
	{ 
		//0
		//10
		//010
		//1010
    for (int r = 1; r <= 4; r++) {
    	for (int c = 0; c < r; c++)
		            {
		            	System.out.print((r + c) % 2 == 0?"1":0);
		            	System.out.print(" ");
			               
		            }
		            System.out.println();
		        }
		    }


	}
