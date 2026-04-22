package Inheritance;

public class Child  extends Parent{
	static {
		System.out.println("Child is loaded.");
	}
	static void respect() {
		System.out.println("Respect Parents.");
	}
}
