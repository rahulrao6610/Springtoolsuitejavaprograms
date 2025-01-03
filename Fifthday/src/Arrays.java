public class Arrays {
	public static void main(String[] args) {
		int[]num= {10,20,30,40,50,60,70,80,90};
		int max=num[0],min=num[0];
		for(int a=1;a<num.length;a++) {
			if(num[a]>max) {
				max=num[a];
			}
			if(num[a]<min) {
				min=num[a];
			}
		}
			System.out.println("max---->"+max);
			System.out.println("min----->"+min);
	}
}
/*max---->90
min----->10*/