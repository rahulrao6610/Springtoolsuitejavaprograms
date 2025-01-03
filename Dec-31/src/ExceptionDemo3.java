class student{
	int id;
	String name;
	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}
	public int getid() {
		return id;
	}
	public void setid() {
		this.id=id;
	}
	public String getname() {
		return name;
		
	}
	public void setname() {
		this.name=name;
	}
}

public class ExceptionDemo3 {
	public static void main(String[] args) {
		//student s1=new student();
		try {
			student s1=null;
			System.out.println("Id ---->"+s1.getid());
			System.out.println("name---->"+s1.getname());
		}catch(Exception e) {
			e.printStackTrace();
		}
		student s2=new student(6610,"rahul");
		System.out.println("name---->"+s2.getname());
		System.out.println("ID---->"+s2.getid());
	}
}
