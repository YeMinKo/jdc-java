import java.util.Scanner;

public class LoadingTimes {
	public static void main(String[] args) {

		System.out.println("Start Program");
		Scanner sc = new Scanner(System.in);

		sc.nextLine();

		LoadDemo demo;
		System.out.println("Declar Class");

		sc.nextLine();

		demo = new LoadDemo();
		System.out.println("Create Object from Class");

		sc.nextLine();

		demo = new LoadDemo();
		System.out.println("Create Object again");
	}
}

class LoadDemo {
	static {
		System.out.println("Static block");
	}

	{
		System.out.println("Instance block");
	}

	LoadDemo() {
		System.out.println("Constructor");
	}
}