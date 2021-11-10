public class Vararges {
	public static void main(String[] args) {
		String[] array = {"A", "B"};
		show("Hello", array);
	}

	static void show(String ...strs) {
		for(String s: strs) {
			System.out.println(s);
		}
	}

	static void show(String string, String ...strs) {
		System.out.println("First: " + string);
		for(String s: strs) {
			System.out.println(s);
		}
	}
}