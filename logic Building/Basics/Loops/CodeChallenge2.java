package Loops;
import java.util.Scanner;

//WAJP to print the multiplication table of any number provided by the User.
public class CodeChallenge2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(n+""+" * "+i+" = "+(n*i));
        }
        
    }
}
