class Unary2 
{
	public static void main(String[] arg)
	{
		int a=20;
		int b= a++ - --a + a++;
		int c= a-- - b-- + --a + --b + b--;
		int d= a++ + b++ + c-- - --a + --b + b-- - c++ - --c + a++;
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);	
	}
}