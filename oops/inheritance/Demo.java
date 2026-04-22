package Inheritance;
//Inherit Static members
public class Demo {
	static int a =100;
	static void disp() {
		System.out.println("Hello");
	}
	public static void main(String[] arg) {
		System.out.println(a);
		disp();
	}
}
