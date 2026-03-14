class BitwiseOperator{
	public static void main(String [] args)
	{
		int a = 125;
		int b =85;
		System.out.println("a = "+a);
		System.out.println("b = " +b); 

		int result1=a & b; //Bitwise AND	
		System.out.println("Bitwise AND: "+result1);

		int result2= a | b; //Bitwise OR
		System.out.println("Bitwise OR: "+result2);
		
		int result3 = ~a; //Bitwise NOT
		System.out.println("Bitwise NOT: "+result3);
	
		int result4 = a<<b; //Bitwise LEFT SHIFT Operator
		System.out.println("Bitwise LEFT SHIFT: "+result4); 
		
		int result5 = a>>b; //Bitwise RIGHT SHIFT Operator
		System.out.println("Bitwise RIGHT SHIFT: "+result5);
		
	}
}