class UsingDemo {
	public static void main(String[] args) {
		int result = Calculator.add(10, 1);
		System.out.println(result);

		Calculator calc = new Calculator();
		result = calc.divide(10, 5);
		System.out.println(result);
	}
}