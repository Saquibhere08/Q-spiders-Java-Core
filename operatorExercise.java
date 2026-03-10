class operatorExercise{

	public static void main(String[] arg)
	{
		System.out.println(10+20);
		System.out.println(2+5.6);
		System.out.println("Hello"+2026);
		System.out.println("Hi"+"Bye");
		System.out.println(100+"hi");
		System.out.println(100+"200");

		// System.out.println(10+'20'); //compile-time-error

		System.out.println('A'+100);
		System.out.println('A'+"B");
		System.out.println(true + "false");
		System.out.println("hello"+20+5);
		System.out.println("true"+false);

		// System.out.println(true+'A'); //compile-time-error

		System.out.println("A"+false);
		System.out.println("100"+false);
		System.out.println("true"+"false");
		System.out.println("true"+100);
		System.out.println('A'+"100");
		System.out.println(10+"true"+20);

		// System.out.println(20+10+false); //compile-time-error

		System.out.println(10+20+"Bye");
		System.out.println("Thank You!");
	}

}