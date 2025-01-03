public class BankAccount {
	long accno;
	String name;
	int balance,amt;
	String address;
	String mobile;
	public BankAccount(long accno, String name, int balance, String address, String mobile) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		this.address = address;
		this.mobile = mobile;
		System.out.println("enter the opening amount:"+this.balance);
	}
	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", name=" + name + ", balance=" + balance + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}
	void deposit(int amt) {
		balance=balance+amt;
		System.out.println("enter the amount to deposit:"+amt);
	}
	void withDraw(int amt) {
		this.balance=this.balance-amt;
		System.out.println("enter the withdrawal:"+amt);
	}
	void checkbalance() {
		System.out.println("show the available balance:"+this.balance);
	}
	public static void main(String[] args) {
		BankAccount c1=new BankAccount(2838298192L,"rahul",5000,"kmr","9490929600");
		System.out.println(c1);
		c1.deposit(5000);
		c1.checkbalance();
		c1.withDraw(4000);
		c1.checkbalance();
	}
}
