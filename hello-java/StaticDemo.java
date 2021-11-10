public class StaticDemo {

	String instanceMessage = "Instance Variable";
	static String message = "Static Variable";

	public static void main(String[] args) {
		StaticDemo demo = new StaticDemo();
		demo.instaceMethod();
		hello();
	}

	void instaceMethod() {
		System.out.println("Instace Method");

		// Instance Variable
		System.out.println(instanceMessage);

		// Static Variable
		System.out.println(message);

		// Instance Method
		greet();

		// Static Method
		hello();
	}

	static void hello() {
		System.out.println("Hello Static Method");
	}

	void greet() {
		System.out.println("Hello Java");	
	}
}