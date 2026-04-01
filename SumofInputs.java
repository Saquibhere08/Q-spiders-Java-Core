//important Question
package Programms;
import java.util.Scanner;
public class SumofInputs {

	public static void main(String[] args) {
		// user input and sum of the inputs
		Scanner s=new Scanner(System.in);
		System.out.println("Sum of Two Numbers from the Given Input");
		System.out.print("Enter number: ");
		int sum=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++) {
				if(i+j==sum) {
					System.out.println(i+ "+" +j + " = "+ sum);
					break;
				}
			}
		}
	}

}
