package Programms;

public class Alphabet {

	public static void main(String[] args) {
		//Printing A-Z / a-z in an single for loop
		
		for(char i='A';i<='z';i++) {
			System.out.println(i);
			if(i=='Z') { //condition to not to include the special characters
				System.out.println("========================");
				i='a'-1; //prints till from a to z
			}
			
		}

	}

}







