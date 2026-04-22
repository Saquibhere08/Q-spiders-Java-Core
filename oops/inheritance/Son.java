package Inheritance;

public class Son extends Father{
	String name="Smith";
	void sondetails() {
		System.out.println("Father Name: "+super.name);
		System.out.println("Son's Name: "+this.name);
		
	}
}
