package school.management.system;
/**
 * this class is responsible for keeping track
 *  of the teachers name, id and salary
 */
public class Teacher {
	private int ID;
	private String name;
	private int salary;
	private int salaryEarned;
	
	
	/**
	 * creates new teacher object 
	 * @param ID id for the teacher
	 * @param name name of the teacher
	 * @param Salary salary of the teacher
	 */
	
	public Teacher(int ID, String name, int salary){
		this.ID  = ID;
		this.name = name;
		this.salary = salary;
		salaryEarned = 0;
		
	}
	
	 /**
	  * 
	  * @return the id of the teacher
	  */
	
	public int getID() {
		return ID;
	}
	
	/**
	 * 
	 * @return name of the teacher
	 */
	
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @return the salary of the of the teacher
	 */
	public int getSalary() {
		return salary;
	}
	
	/**
	 * set the salary, as it might be updated through time 
	 * @param salary
	 */
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/**
	 * adds to the salary
	 * removes from the total money earned by the school
	 * @param salary update salary
	 */
	public void receiveSalary(int salary) {
		salaryEarned = salary;
		School.updateTotalMoneySpent(salary);
	}
}

