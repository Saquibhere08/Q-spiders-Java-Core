package Loops;
//WAJP to print sum of n Natural Numbers.
import java.util.Scanner;
public class CodeChallenge1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value of N: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            //System.out.println(i);
            sum+=i;

            System.out.println("Sum: "+sum);
        }
    }
}
