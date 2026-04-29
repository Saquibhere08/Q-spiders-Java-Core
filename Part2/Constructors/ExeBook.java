package constructors;

public class ExeBook {

	public static void main(String[] args) {
		System.out.println("5 Important Books");
		System.out.println("========================");
		
		Books b1=new Books("Java","James",1000,172	);
		Books b2=new Books("Python","Guido",100,100	);
		Books b3=new Books("C/C++","D.Ritchie",5000,200	);
		Books b4=new Books("DBMS","E.F. CODD",1200,192	);
		Books b5=new Books("SQL","Raymond Boyce",1500,102	);
		
		System.out.println("Name: "+b1.title);
		System.out.println("Author: "+b1.author);
		System.out.println("Price: "+b1.price);
		System.out.println("Pages: "+b1.pages);
		
		System.out.println("========================");
		
		System.out.println("Name: "+b2.title);
		System.out.println("Author: "+b2.author);
		System.out.println("Price: "+b2.price);
		System.out.println("Pages: "+b2.pages);
		
		System.out.println("========================");
		
		System.out.println("Name: "+b3.title);
		System.out.println("Author: "+b3.author);
		System.out.println("Price: "+b3.price);
		System.out.println("Pages: "+b3.pages);
		
		System.out.println("========================");
		
		System.out.println("Name: "+b4.title);
		System.out.println("Author: "+b4.author);
		System.out.println("Price: "+b4.price);
		System.out.println("Pages: "+b4.pages);
		
		System.out.println("========================");
		
		System.out.println("Name: "+b5.title);
		System.out.println("Author: "+b5.author);
		System.out.println("Price: "+b5.price);
		System.out.println("Pages: "+b5.pages);
		
	}

}
