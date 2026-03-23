package methodS;

public class NumberCheck {

	public static void main(String[] args) {
		/*
		 Create a class NumberCheck with a variable num=7. 
		 Write a no-argument method checkEvenOdd()
		 that checks and prints whether the number is even or odd. 
		 */
		
		checkEvenOdd();
	}
	public static void checkEvenOdd() {
		int num=1333;
		if(num % 2 == 0) {
		System.out.println(num+" is Even...");
	}else {
		System.out.println(num+ " is Odd...");
	}
	}
}
