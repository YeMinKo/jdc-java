public class ScopeDemo {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.doSomething("Hello");
	}
}

/**
 * Class
 */
class Demo {

	{
		//Code Block
		// System.out.println("Code Block: Body: " + body);
	}

	/*
	 * This is constructor 
	 */
	Demo() {
		System.out.println("Constructor: Body: " + body);
	}

	// Method
	void doSomething(String arg) {
		
		System.out.println("doSomething: Body: " + body + test);
		
		// For Block
		for(int i = 0; i < 10; i++ ){
			System.out.println("For loop: Body: " + body);
		}
	} 

	int body = 1;

	{	
		String name = "Block Variable";
		//Code Block
		System.out.println("Code Block: Body: " + body);
	}
}