package school.management.system;


import java.util.List;
/**
 * A school can have many students, teachers and etc
 * 
 */

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/**
	 * new school object is created
	 * @param teachers list of teachers in the school
	 * @param students list of students in the school 
	 */
	
	public School(List<Teacher> teachers, List<Student> students) {
		this.students = students;
		this.teachers = teachers;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}
	/**
	 * 
	 * @return the list of teachers in the school
	 */
	public List<Teacher> getTeachers(){
		return teachers;
	}
	
	/**
	 * adds teacher to the school
	 * @param teachers the teacher to be added
	 */
	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	/**
	 * 
	 * @return the number of students
	 */
	
	public List<Student> getStudents(){
		return students;
	}
	
	/**
	 * add a student in the array
	 * @param student the student to be added
	 */
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	/**
	 * 
	 * @return money earned by school 
	 */
	
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	/**
	 * updates the money earned by the school,
	 * it is a setter but instead an update word is used, 
	 * no difference
	 * @param moneyEarned
	 */
	
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}
	
	/**
	 * 
	 * @return total money spent by the school
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	/**
	 * used to update total money spent 
	 * it is the same as setter
	 * the salary given to teachers 
	 * @param moneySpent added to total money spent in school
	 */
	
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned  -= moneySpent;
	}
	
}


