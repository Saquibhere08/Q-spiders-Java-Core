class Demo5
{
	public static void main(String [] arg)
	{
		int a=100;
		{
			int b=200;
			System.out.println(a); //CTS
		}
		{
			int c=300;
			System.out.println(a); //CTS
		}
	}
}