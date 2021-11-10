package hello;

public class Hello {

	hello.sub.SubClass sub = new hello.sub.SubClass();

	public void greet() {
		System.out.println("Hello Java");
		sub.greet();
	}
}