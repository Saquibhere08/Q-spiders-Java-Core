//Copy Constructor
package constructors;

public class Car {
	String brand;
	String color;
	double price;
	
	//void displayCar(){
		
	//}
	
	Car(String brand,String color,double price){
				this.brand=brand;
				this.color=color;
				this.price=price;
	}
	Car(Car car){
		this.brand=car.brand;
		this.color=car.color;
		this.price=car.price;
	}
}
