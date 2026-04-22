package Inheritance;

public class Student extends Person {
	int sid;
	Student(String name,int sid){
		super(name);
		this.sid=sid;
	}
}
