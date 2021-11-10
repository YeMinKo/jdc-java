public class NestedDemo {
	public static void main(String[] args) {

		Outer.InnerStatic obj1 = new Outer.InnerStatic();
		obj1.getMessage();


		Outer.Inner obj2 = new Outer().new Inner();
		obj2.getMessage();
	}
}