
public class Test1 extends abstractclassTest{

	@Override
	void m2() 
	{
		System.out.println(" over ride method m2");		
	}

	@Override
	void m3() 
	{
		System.out.println(" over ride method m3");		
	}

	@Override
	void m4() 
	{
	System.out.println("m4");			
	}
	
	
	public static void main(String[] args) 
	{
	Test1 t = new Test1();
	t.m1();
	t.m2();
	t.m3();
	t.m4();
	}
}


