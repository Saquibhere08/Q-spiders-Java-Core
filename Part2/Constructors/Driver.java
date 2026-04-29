package constructors;

public class Driver {

	public static void main(String[] args) {
		// Accessing from Book class
		Book b1=new Book();
		
		Book b2=new Book();
		
		b1.title="Java";
		b1.author="James";
		b1.price=4500;
		
		b2.title="Python";
		b2.author="Guido";
		b2.price=100;
		
		System.out.println("Title: "+b1.title);
		System.out.println("Title: "+b1.author);
		System.out.println("Title: "+b1.price);
		
		System.out.println("=================================");
		
		System.out.println("Title: "+b2.title);
		System.out.println("Title: "+b2.author);
		System.out.println("Title: "+b2.price);
		

	}

}
