package model;

public abstract class Person {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public  String toString() {
		String string = "\nName: " + name;
		return string;
	}
	
	public abstract boolean isStudent();
	public abstract boolean isInstructor();
}
