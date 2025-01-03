class student{
	int id;
	String name;
	String college;
	int fee;
	String dept;
	public student(int id, String name, String college, int fee, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.fee = fee;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", college=" + college + ", fee=" + fee + ", dept=" + dept
				+ "]";
	}
}
public class OopsConcept {
	public static void main(String[] args) {
	student rahul=new student(10,"rahulroy","Stpeters",55000,"CSM-A");
	student ramu=new student(10,"rahulroy","Stpeters",55000,"CSM-A");
	student rakesh=new student(10,"rahulroy","Stpeters",55000,"CSM-A");
	student ranjith=new student(10,"rahulroy","Stpeters",55000,"CSM-A");
	student ravi=new student(10,"rahulroy","Stpeters",55000,"CSM-A");
   System.out.println(rahul);
   System.out.println(ramu);
   System.out.println(rakesh);
   System.out.println(ranjith);
   System.out.println(ravi);
	}

}
