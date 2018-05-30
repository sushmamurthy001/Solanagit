import java.util.Scanner;

public class palindrome1 {
public static void main (String args[]) {
	Scanner scan=new Scanner (System.in);
	String str;
	System.out.println("enter string");
	str=scan.next();
	String reverse=new StringBuffer(str).reverse().toString();
	if(str.equals(reverse))
	{
		System.out.println("True" );
	}
	else {
		System.out.println("false");
	}
	
}
}
