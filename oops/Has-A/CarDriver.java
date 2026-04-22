package HasARelation;
import java.util.Scanner;
public class CarDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Brand Car: ");
		String brand=sc.next();
		System.out.println("Enter Color: ");
		String color=sc.next();
		System.out.println("Enter Price: ");
		double price=sc.nextDouble();
		System.out.println("Enter Hp: ");
		double hp=sc.nextDouble();
		System.out.println("Enter CC");
		double cc=sc.nextDouble();
		Car c=new Car(brand,color,price,new Engine(hp,cc));
		System.out.println("********Car Details**************");
		System.out.println("********************************");
		c.carDetails();
		System.out.println("********Engine Details**************");
		System.out.println("********************************");
		e.engineDetails();
		
		
		
	}	

}
