package TypeCasting;
//Non-primitive Type casting
public class Student extends Person {
	int sid;
	Student(String name, int sid){
		super(name);
		this.sid=sid;
	}
}
