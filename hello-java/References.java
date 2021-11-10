import java.util.Scanner;

public class References{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("========================");
		System.out.println("=========START==========");
		System.out.println("========================");

		sc.nextLine();

		
	}
}

class Student {
	private String name;

	Student(String name) {
		this.name = name;
	}

	void greet() {
		System.out.println("Hello " + name);
	}
}