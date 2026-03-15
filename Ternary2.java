class Ternary2
{
	public static void main(String[] arg)
	{
		int a=10;
		int b=20;
		int c=30;
		
		int res= a>b && a>c?a: b>c?b:c;
		System.out.println("The Greatest Among 3 Numbers: "+res);	
	}	
}