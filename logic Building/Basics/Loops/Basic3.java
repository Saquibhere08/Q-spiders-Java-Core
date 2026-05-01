package Loops;
import java.util.Scanner;
public class Basic3 {

	public static void main(String[] args) {
		// Print Numbers from N to 1
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int n=sc.nextInt();
        int sum=0;
		for(int i=1;i<=n;i++) {
            sum+=i;
			System.out.println("Sum of N Numbers: "+sum);
		}

	}

}
