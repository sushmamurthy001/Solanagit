
public class Maths {
	

	public void add()
	{
		System.out.println("method over loading pgm output");
	}
	
	private void add(int x, int y)
	{
		int res=x+y;
		System.out.println("1st method " + res);
	}
	void add(int x, int y, int z)
	{
		int res=x+y+z;
		System.out.println("2nd method " + res);
	}
	void add(double x, int y)
	{
		double res=x+y;
		System.out.println("3rd method " + res);
	}
	void add(double x, double y)
	{
		double res=x+y;
		System.out.println("4th method " + res);
	}
	
	void add(double x, float y)
	{
		double res=x+y;
		System.out.println("5th method " + res);
	}
	
	void add(float x, float y, double z)
	{
		double res=x+y+z;
		System.out.println("6th method " + res);
	}
	
	public static void main(String[] args) 
	{
		Maths m = new Maths();
		m.add();
		m.add(5, 5);
		m.add(5, 5, 5);
		m.add(5d, 5);
		m.add(5.5d, 5d);
		m.add(5d, 5f);
		m.add(5.0f, 5.5f, 5.5d);
		
	}
}
