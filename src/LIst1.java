import java.util.ArrayList;
import java.util.List;

public class LIst1 {
	public void list1() 
	{
		List l = new ArrayList();
		
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
		
		System.out.println("list size is " + l.size());
		
		for(int i=0; i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}
	
	public void list2() 
	{
		List<String> l = new ArrayList<String>();
		l.add("abc");
		l.add("xuz");
		l.add("abc");
		//l.add(1);
		l.add(" ");
		//l.add(2);
		//l.add(true);
		//l.add('c');
		l.add(" ");
		System.out.println("list size is " + l.size());
		/*for (Listdatatype variable : listname) {
			
		}*/		
		for (String var : l) 
		{
			System.out.println(var);
		}
	}
	
	public static void main(String[] args) 
	{
		LIst1 l = new LIst1();
		l.list1();
		l.list2();
}
}