package ExceptionHandling;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Main Starts.....");
		int a=100;
		int b=0;
		try{
			int res= a/b;
			System.out.println(res);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception is Handled...");
		}
		
		System.out.println("Main Ends......");
		
	}
}
