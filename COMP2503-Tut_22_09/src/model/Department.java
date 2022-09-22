package model;
import java.util.ArrayList;

public class Department {
	
	ArrayList<Person> people = new ArrayList<Person>();

	public void addPerson(Person person) {
		people.add(person);
	}
	
	public ArrayList<Student> getStudents() {
		ArrayList<Student> students = new ArrayList<Student>();
		for(int i=0; i < people.size(); i++) {
			if (people.get(i).isStudent()) {
				Person person = new Student();
				person = people.get(i);
				Student student = (Student) person;
				students.add(student);
				}
			}
		return students;
	}
	
	public ArrayList<Instructor> getInstructors() {
		ArrayList<Instructor> instructors = new ArrayList<Instructor>();
		for(int i=0; i < people.size(); i++) {
			if (people.get(i).isInstructor()) {
				Person person = new Instructor();
				person = people.get(i);
				Instructor instructor = (Instructor) person;
				instructors.add(instructor);
				}
			}
		return instructors;
	}

}

