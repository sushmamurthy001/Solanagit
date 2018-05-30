
public class MathsExe extends Maths1{
	@Override
	void sub(int x,int y) {
		System.out.println("output is "+(x-y));
	}
	@Override
	void div(int x,int y) {
		System.out.println("output is "+(x/y));
	}
	
	public static void main(String args[]) {
		
		MathsExe e=new MathsExe();
		e.add(2, 2);
		e.sub(5, 5);
		e.div(5, 5);
		
	}

}
