package LogicBuilding.src.Basics;
//calculating Area of Shapes
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        squareArea(sc);
        rectangleArea(sc);
        circleArea(sc);
        triangleArea(sc);
    }
    public static void squareArea(Scanner sc){
        System.out.print("Enter Side: ");
        int s=sc.nextInt();
        int Area= (s*s); //area of Square
        System.out.println("Area of Square: "+Area);
    }
    public static void rectangleArea(Scanner sc){
        System.out.print("Enter Length: ");
        int l=sc.nextInt();
        System.out.print("Enter Breadth: ");
        int b=sc.nextInt();
        int Area= 2*(l*b); //area of rectangle
        System.out.println("Area of Rectangle: "+Area);
    }
    public static void circleArea(Scanner sc){
        System.out.print("Enter radius: ");
        double r=sc.nextDouble();
        double Area= Math.PI*(r*r); //area of circle
        System.out.println("Area of Circle: "+Area);
    }
    public static void triangleArea(Scanner sc){
        System.out.print("Enter Base: ");
        double b=sc.nextDouble();
        System.out.print("Enter Height: ");
        double h=sc.nextDouble();
        double Area= 0.5*b*h; //area of triangle
        System.out.println("Area of Triangle: "+Area);
    }        
}        

