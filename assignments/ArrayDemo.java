import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Container c1 = new Container();

		int index = c1.add(1);
		System.out.println("Added Index: " + index);

		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.add(5);

		for(int num: c1.get()) {
			System.out.println("num: " + num);
		}
	}
	
}

class Container {
 private int[] array = new int[0];

	int add(int data) {
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = data;
		return array.length -1;
	}

	int[] get() {
		return array;
	}
}