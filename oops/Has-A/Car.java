package HasARelation;

public class Car {
	String brand;
	String color;
	double price;
	
	Engine e;
	
	Car(String brand,String color,double price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.e=e;
	}
	public void carDetails() {
		System.out.println("Brand: "+brand);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);
	}
}
