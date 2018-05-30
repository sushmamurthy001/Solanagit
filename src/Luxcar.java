
public class Luxcar extends Car{
	@Override
	void ac() {
		System.out.println("ac is working");
	}

	void luxinfo(int price,String model) {
		System.out.println("lux car model"+model);
		System.out.println("price is"+price);
	}

	void gps() {
		// TODO Auto-generated method stub
		System.out.println("gps is there");
	}
}
