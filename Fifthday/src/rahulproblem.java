
public class rahulproblem {

	public static void main(String[] args) {
	int []heights= {30,10,22,30,40,50,79};
	int max=heights[0];
	int count=1;
	int doller=17;
	for(int i=1;i<heights.length;i++) {
		if(heights[i]>max) {
			max=heights[i];
			count++;
		}
	}
	System.out.println("max no----->"+count*doller);
	}

}

