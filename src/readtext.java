





public class readtext {
	
	public static void main (String args[]) {
		String text = "Delhi";
		int l = text.length();
		System.out.println("The length is: " + l);
		
		for (int i = 0; i<= l; i++)
		{
			char c = text.charAt(i);
			System.out.println(c);	
		}

}}

