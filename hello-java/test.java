class HelloJava {
	String name = "Mg Mg";

	// HelloJava() {
	// }

	HelloJava(String name){
		this.name = name;
	}

	HelloJava greet() {
		return null;
	}
}

class HelloTest extends HelloJava {
	int name = 10;

	// HelloTest(){}

	HelloTest(int num) {
		super("");
	}

	HelloTest greet() {
		return null;
	}
}

public class test implements MyInterface{
	public static void main(String[] args) {
		HelloTest obj = new HelloTest(1);
		HelloJava obj2 = obj;
		System.out.println(obj2.name);

		int num;
		num = 10;
		System.out.println(num);
		MyInterface.hello();
	}

	void greet(String name){}
	void greet(int name){}
}

interface MyInterface {
	public static void hello() {
		System.out.println("Hi static");
	}

	default void hello2(){
		System.out.println("Hello");
	}

	private void hello3() {
		System.out.println("Hola");
	}
}