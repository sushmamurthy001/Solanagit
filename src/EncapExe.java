
public class EncapExe {
	public static void main(String args[]) {
		Encap e=new Encap();
		e.setA(100);
		int x=e.getA();
		
		
		e.setB(400);
		int y=e.getB();
		
		System.out.println(x+y);
	}

}
