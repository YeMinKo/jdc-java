public class MyFirstProgram {
	public static void main(String[] args){
		System.out.println("Hello World");
		System.out.println("Length of args: "+ args.length);
		for(String arg: args){
			System.out.println("Arg: " + arg);
		}

		Dog aungNet = new Dog();
		aungNet.name = "Aung Net";
		aungNet.greet();

		Dog goteKyar = new Dog();
		goteKyar.name = "Gote Kyar";
		goteKyar.greet();
	}
}

class Dog {
	String name; 

	void greet() {
		System.out.println("Hi! I am " + name);
	}
}