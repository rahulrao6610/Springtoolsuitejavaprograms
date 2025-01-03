public class BankExceptionDemo {

	public static void main(String[] args) {
	
		SBIBank sbi1 = new SBIBank(5000);
		SBIBank sbi2=new SBIBank(50000);
		sbi1.withDraw(10000);
		sbi1.withDraw(7000);
		sbi1.withDraw(1000);
		sbi2.deposit(500000);
		sbi2.deposit(10000);
		sbi2.deposit(5000);
		
	}

}