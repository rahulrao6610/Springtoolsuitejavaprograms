
public class Test {

	public static void main(String[] args) {
		long pT=System.currentTimeMillis();
		String name="abc";
		for(int i=1;i<=100;i++) {
			name=name+i;
		}
		long cT=System.currentTimeMillis();
		long diff=cT-pT;
		System.out.println("diff---->"+diff);
		long pT1=System.currentTimeMillis();
		StringBuffer name1=new StringBuffer("abs");
		for(int i=1;i<=100;i++) {
			name1=name1.append("i");
		}
		long cT1=System.currentTimeMillis();
		long diffT1=cT1-pT1;
	    System.out.println("diff1--->"+diffT1);
		}
	}

