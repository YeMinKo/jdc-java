public class ConstructorDemo {
	public static void main(String[] args) {
		Hello hello;
		hello = new Hello(2);
		hello.greet();
	}
}

class Hello {

	static int count;

	Hello(int count) {
		this.count = count;

	}

 	void greet() {
 		int count = 20;
		System.out.println("Hello Java: " + this.count);
 	}
}