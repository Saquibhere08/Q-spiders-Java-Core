/*
	Transactions performed in the Wallet
	Added 10000
	Shopping 4000
	Cashback 10%
	Movie 600
	Popcorn 350
	Drinks 150
	Dinner 2000
	Cashback 15%
	petrol 500
*/
class Paytm{
	public static void main(String[] arg)
	{
		double wallet = 10000;
		double shopping=4000;
		double cb1 = 4000*0.1;
		double movie = 600;
		double popcorn = 350;
		double drinks = 150;
		double dinner = 2000;
		double cb2 = 2000*1.5;
		double petrol =500;

		System.out.println("Wallet amount: Rs. "+wallet);
		
		wallet -=shopping;
		System.out.println("- Shopping: Rs. "+wallet);
		
		wallet +=cb1;
		System.out.println("+ CashBack 10%: Rs. "+wallet);
		
		wallet -=movie;
		System.out.println("- Movie: Rs. "+wallet);
		
		wallet -=popcorn;
		System.out.println("- Popcorn: Rs. "+wallet);
		
		wallet -=drinks;
		System.out.println("- Drinks: Rs. "+wallet);
		
		wallet -=dinner;
		System.out.println("- Dinner: Rs. "+wallet);
		
		wallet += cb2;
		System.out.println("+ CashBack : Rs. "+wallet);
		
		wallet -= petrol;
		System.out.println("- Petrol: Rs. "+wallet);
		
		System.out.println("Remaining Balance: Rs. "+wallet);



	}
}