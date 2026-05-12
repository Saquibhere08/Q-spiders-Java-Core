package ExceptionHandling;
//Using age as String
import java.util.Scanner;
public class Demo2 {
	public static void main(String[] args) {
		System.out.println("Main Starts.....");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age: ");
		
		try {
			int age=sc.nextInt();
			System.out.println(age);
		}
		catch(Exception e) {
			System.out.println("Enter age  in Integer Format...");
		}
		System.out.println("Main Ends.....");
	}
}
