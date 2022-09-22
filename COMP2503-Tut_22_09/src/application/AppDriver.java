package application;
import java.util.ArrayList;

import model.*;

public class AppDriver {
	
	public static double getGradesAverage(Department department) {
		ArrayList<Student> students = department.getStudents();
		double sum = 0;
		for (int i=0; i<students.size(); i++) {
			sum = sum + students.get(i).getGrade();
		}
		double average = sum / students.size();
		return average;
	}
	
	public static double getSalaryAverage(Department department) {
		ArrayList<Instructor> instructors = department.getInstructors();
		double sum = 0;
		for (int i=0; i<instructors.size(); i++) {
			sum = sum + instructors.get(i).getSalary();
		}
		double average = sum / instructors.size();
		return average;
	}
	
	public static double getAverage(Measurable m) {
		
		//(...)
		
		double average = 0;
		return average;
	}

	public static void main (String args[]) {
		
		Student s1 = new Student();
		s1.setName("Maria");
		s1.setProgram("CIS");
		s1.setGrade(93.00);
		
		Instructor i1 = new Instructor();
		i1.setName("Muhnima");
		i1.setProgram("CIS");
		i1.setSalary(123456.71);
		
		Student s2 = new Student();
		s2.setName("Arthur");
		s2.setProgram("CIS");
		s2.setGrade(97.50);
		
		Instructor i2 = new Instructor();
		i2.setName("Steve");
		i2.setProgram("CIS");
		i2.setSalary(122233.28);
		
		Department department = new Department();
		department.addPerson(s1);
		department.addPerson(i1);
		department.addPerson(s2);
		department.addPerson(i2);
		
		System.out.println(department.getStudents().toString());
		System.out.println(department.getInstructors().toString());
		System.out.println(getGradesAverage(department));
		System.out.println(getSalaryAverage(department));

	}
	
}

