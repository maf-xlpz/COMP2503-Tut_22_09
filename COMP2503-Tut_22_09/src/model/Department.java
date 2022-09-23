package model;
import java.util.ArrayList;

public class Department {
	
	ArrayList<Measurable> people = new ArrayList<Measurable>();

	public void addPerson(Measurable person) {
		people.add(person);
	}
	
	public ArrayList<Measurable> getStudents() {
		ArrayList<Measurable> students = new ArrayList<Measurable>();
		for(int i=0; i < people.size(); i++) {
			Measurable person = people.get(i);
			if (person instanceof Student) {
				Student student = (Student) person;
				students.add(student);
				}
		}
		return students;
	}
	
	public ArrayList<Measurable> getInstructors() {
		ArrayList<Measurable> instructors = new ArrayList<Measurable>();
		for(int i=0; i < people.size(); i++) {
			Measurable person = people.get(i);
			if (person instanceof Instructor) {
				Instructor instructor = (Instructor) person;
				instructors.add(instructor);
				}
		}
		return instructors;
	}

}

