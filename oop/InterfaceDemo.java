interface Testable {
	static void greet() {
		System.out.println("Hello from static method");
	}

	private void add(){

	}

	void hello();
}

interface helloInterface extends Testable {
	void hi();
}

interface myInterface extends helloInterface{

}

public class InterfaceDemo implements myInterface {
	public void hello() {
		System.out.print("Hello");
	}

	public void hi() {

	}
}