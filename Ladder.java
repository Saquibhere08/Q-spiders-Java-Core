package decision;

public class Ladder {

	public static void main(String[] args) {
		//conditionals Statements - if else Ladder
			int userId=555;
			int userPwd=666;
			int dbId=555;
			int dbPwd=666;
			
			if(userId == dbId) {
				if(userPwd == dbPwd) {
					System.out.println("Welcome to Homepage");
				}else if(userId !=dbId) {
					System.out.println("Worng  username or password");
			}
			else if(userPwd !=dbPwd) {
					System.out.println("Wrong username or password");
			}else
				System.out.println("Invalid Output");
	}
}
}

