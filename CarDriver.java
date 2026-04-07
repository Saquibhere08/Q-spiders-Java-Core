//copy constructor
package constructors;

public class CarDriver {
	public static void main(String [] arg) {
		Car original=new Car("Audi","Pink",240000);
		Car duplicate=new Car(original);
		
		original.brand="BMW";
		duplicate.color="Black";
		
		System.out.println("====================ORIGINAL CAR DETAILS===============");
		System.out.println("Brand: "+original.brand);
		System.out.println("Color: "+original.color);
		System.out.println("Price: "+original.price);
		
		System.out.println("========================DUPLICATE CAR==================");
		System.out.println("Brand: "+duplicate.brand);
		System.out.println("Color: "+duplicate.color);
		System.out.println("Price: "+duplicate.price);
		
	}
}
