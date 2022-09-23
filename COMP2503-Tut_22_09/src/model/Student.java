package model;

public class Student extends Person implements Measurable {

	private String program;
	private double grade;

	@Override
	public String toString() {
		String string = "\nName: " + getName() + "\nProgram: " + program + "\nGrade: " + grade;
		return string;
	}
	
	public String getProgram() {
		return program;
	}
	
	public void setProgram(String program) {
		this.program = program;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	@Override
	public boolean isStudent() {
		return true;
	}

	@Override
	public boolean isInstructor() {
		return false;
	}

	@Override
	public double getAmount() {
		return grade;
	}

}
