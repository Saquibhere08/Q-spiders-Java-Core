class Unary{
	public static void main(String [] args)
	{
		int a=10;
		int b= a++ + ++a + --a;
		int c= a-- + --b + b-- + a++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}