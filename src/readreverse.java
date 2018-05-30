import java.util.Scanner;

public class readreverse {

public static void main (String args[]) {
	Scanner scan = new Scanner (System.in);
	String str;
	System.out.println("enter string");
	str=scan.next();
	String reverse=new StringBuffer(str).reverse().toString();
	int l = reverse.length();
	for (int i=0; i<=l; i++)
	{
		char c = reverse.charAt(i);
		System.out.println(c);
	}
		
}
}
