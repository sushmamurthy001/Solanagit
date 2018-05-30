
public class constructor1 {
	int x, y,z;
	public constructor1()
	{
	System.out.println("This is a constructor");	
	}
	public constructor1(int x, int y)
	{
		System.out.println("local variable x " + x);
		System.out.println("local variable y " + y);
		
		System.out.println("global variable x " + (this.x=x));
		System.out.println("global variable y " + (this.y=y));
		System.out.println("global variable z " + this.z);
	}
	
	void m1()
	{
		System.out.println("m1");
	}
	
	void m2()
	{
		System.out.println("m2");
	}
	
	public static void main(String[] args) 
	{
		constructor1 c = new constructor1();
		c.m1();
		c.m2();
		constructor1 c1=new constructor1(10,10);
	}
		
	
}
