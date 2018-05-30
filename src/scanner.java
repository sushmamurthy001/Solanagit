import java.util.Scanner;

public class scanner {
public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	String  a,b;
	System.out.println("enter a");
	a=scan.next();
	System.out.println("enter b");
	b=scan.next();
	if(a.equalsIgnoreCase(b)) {
		System.out.println("true");
	}
	else
		System.out.println("false");
	
	
	
	
}
}
