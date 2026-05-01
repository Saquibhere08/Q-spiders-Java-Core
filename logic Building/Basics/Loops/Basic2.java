package Loops;
import java.util.Scanner;
public class Basic2 
{
   public static void main(String[] args) 
   {
        //Print Number from N to 1
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n=sc.nextInt();
        for(int i=n; i>=1;i--){
            System.out.println(i);
        }
   } 
}
