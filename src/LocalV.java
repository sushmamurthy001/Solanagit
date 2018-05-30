
public class LocalV {
	public void add(int x,int y) {
		//int res=x+y;
		System.out.println("result is " +(x+y));
	}
	public void subtraction (int a, int b) {
		int c =a-b;
		System.out.println("difference is " +c);
	}
	public static void main(String args[]) {
		LocalV v=new LocalV();
	v.add(2, 2);
	v.subtraction(10, 5);
	}

}
