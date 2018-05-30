
public class Benz extends Luxcar {
	//@Override
	void gps() {
		System.out.println("gps is on");
	}
	public static void main(String args[]) {
		Benz b=new Benz();
		b.start();
		b.stop();
		b.ac();
		b.gps();
		b.model="abc";
		b.price=12345;
		b.luxinfo(b.price, b.model);
	}

}
