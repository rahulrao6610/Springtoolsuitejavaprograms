public class FilpProgram{

    public static void main(String[] args) {
    	   long seq = 123456789;
        Object d;
		printseq(seq);
    }
private static void printseq(long seq) {
		if(seq!=0) {
			long d = 123456789;
			System.out.println(seq/d);
			seq=seq/10;
			printseq(seq);
		}
		
	}
}
