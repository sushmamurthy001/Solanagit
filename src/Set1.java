import java.util.LinkedHashSet;
import java.util.Set;

public class Set1 {
	public void set1() 
	{
		Set l = new LinkedHashSet();
		l.add("abc");
		l.add("xuz");
		l.add("abc");
		l.add(1);
		l.add(" ");
		l.add(2);
		l.add(true);
		l.add('c');
		l.add(" ");
		l.add('c');
		System.out.println("set size is " + l.size());
		
		for(Object var : l)
		{
			System.out.println(var);
		}
	}
	
	
	public void set2() 
	{
		Set<String> l = new LinkedHashSet<String>();
		l.add("abc");
		l.add("xuz");
		l.add("abc");
		//l.add(1);
		l.add(" ");
		//l.add(2);
		//l.add(true);
		//l.add('c');
		//l.add(" ");
	//	l.add('c');
		System.out.println("set size is " + l.size());
		
		for(String var : l)
		{
			System.out.println(var);
		}
	}
	
	public static void main(String[] args) 
	{
		Set1 s = new Set1();
		s.set1();
		s.set2();
	}
}
