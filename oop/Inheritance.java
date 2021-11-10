class Person {
	void greet() {
		System.out.println("Hi");
	}
}

class Student extends Person {

	String greet() {
		System.out.println("Hello");
		return "Hello";
	}
	
}