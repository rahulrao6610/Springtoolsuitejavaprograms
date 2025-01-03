class Std{
	int id;
	String name,address,college;
	int Fee;
	public Std(int id, String name, String address, String college, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.college = college;
		Fee = fee;
	}
	@Override
	public String toString() {
		return "Std [id=" + id + ", name=" + name + ", address=" + address + ", college=" + college + ", Fee=" + Fee
				+ "]";
	}
}
public class Test {
	public static void main(String[] args) {	
    Std s1=new Std(100,"rahul","hyd","Stpeters",100000);
    Std s2=new Std(200,"suresh","pantencheru","stpetters",80000);
    System.out.println(s1);
    System.out.println(s2);
	}

}
