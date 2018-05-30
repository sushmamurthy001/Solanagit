
public class Cat implements Animal{
	@Override
	public void sound() {
		System.out.println("meow");
	}
	@Override
	public void location() {
		System.out.println("tree");
	}
	public static void main(String args[]) {
		Animal a=new Cat();
		a.sound();
		a.location();
	}

}
