package firstday;

public class demo {

	public static void main(String[] args) {
    int amount=15,n10=0,c5=0,c2=0,c1=0;
    if(amount>=10)
    {
    	n10=amount/10;
    	amount=amount-(n10*10);
    }
    if(amount>=5)
    {
    c5=amount/5;
    	amount=amount-(c5*5);
    }
    if(amount>2)
    {
    	c2=amount/2;
    	amount=amount-(c2*2);
    }
    if(amount>1)
    {
    	c1=amount/1;
    	amount=amount-(c1*1);
    }
    System.out.println("10 note---->"+n10);
    System.out.println("5 note---->"+c5);
    System.out.println("2 note---->"+c2);
    System.out.println("1 note---->"+c1);
	}
}