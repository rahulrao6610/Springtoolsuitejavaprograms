interface money{
	void dollorToInr(int usDollor);
	void poundToInr(int ukpound);
}
class IndianRupee implements money{
@Override
	public void dollorToInr(int usDollor) {
		// TODO Auto-generated method stub
		float res=84.75f*usDollor;
		System.out.println("indian rupess--->"+res);
	}
@Override
	public void poundToInr(int ukpound) {
		// TODO Auto-generated method stub
		float res=120.65f*ukpound;
		System.out.println("indian rupess--->"+res);
	}
}
public class CurrencyDemo {
public static void main(String[] args) {
	IndianRupee indrup=new IndianRupee();
	indrup.dollorToInr(100);
	indrup.poundToInr(100);
	}

	
}
