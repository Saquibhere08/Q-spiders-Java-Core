package Inheritance;
//Inherit Static members
public class Test extends Demo {
	static int b=200;
	static void test() {
		System.out.println("Testing");
		
	}
	public static void main(String[] arh) {
		System.out.println(b);
		test();
		System.out.println(a);
		disp();
		System.out.println(Test.a);
		Test.disp();
		Test.test();
	}
}
