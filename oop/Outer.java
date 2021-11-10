public class Outer {

	public static void main(String[] args) {
		InnerStatic obj1 = new InnerStatic();
		obj1.getMessage();

		Inner obj2 = new Outer().new Inner();
		obj2.getMessage();

		staticHello();
		test();
	}

	public static void test() {
		Inner inner = new Outer().new Inner();
		inner.getMessage();
	}


	void hello() {
		System.out.println("Instance Hello");
	}

	static void staticHello() {
		System.out.println("Static Hello");
	}


	public static class InnerStatic {
		public void getMessage() {
			System.out.println("Hello from inner static");
		}
	}

	public class Inner {
		public void getMessage() {
			System.out.println("Hello from inner");
		}
	}

	static {
		final class Hello {
			void test() {
				System.out.println("From local class");
			}
		}

		new Hello().test();
	}
}