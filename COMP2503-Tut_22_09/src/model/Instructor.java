package model;

public class Instructor extends Person implements Measurable{
	
	private String program;
	private double salary;
	
	@Override
	public String toString() {
		String string = "\nName: " + getName() + "\nProgram: " + program + "\nSalary: $" + salary;
		return string;
	}
	
	public String getProgram() {
		return program;
	}
	
	public void setProgram(String program) {
		this.program = program;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public boolean isInstructor() {
		return true;
	}

	@Override
	public boolean isStudent() {
		return false;
	}

	@Override
	public void getAmount() {
		// TODO Auto-generated method stub
		
	}

}

