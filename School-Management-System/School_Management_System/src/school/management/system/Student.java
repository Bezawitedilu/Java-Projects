package school.management.system;

//this class is responsible for keeping 
//track of students fees, name ...

public class Student {
	
	private int ID;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * 
	 * @param ID unique identifier for ID 
	 * @param name unique identifier for name
	 * @param grade unique identifier for grade
	 */
	
	public Student(int ID, String name, int grade) {
		this.feesPaid = 0;
		this.feesTotal = 30000; 
		this.ID = ID;
		this.name = name;
		this.grade = grade;
	}
	
	//not going to use a setter and getter for ID and name because they are not altered
	
	/**	
	 * Used to update the students grade
	 * @param grade new grade of the student
	 */
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	/**
	 * keep adding the fees to fees paid
	 * add the fees to the fees paid
	 * @param fees the school is going to receive that amount as a payment
	 */
	
	public void payFeesPaid(int fees) {
		feesPaid = feesPaid + fees;
		School.updateTotalMoneyEarned(feesPaid);
		
		//it has to be static from there unless we need to call it as an instance
	}
	
	/**
	 * ID
	 * @return ID of student
	 */
	
	public int getID() {
		return ID;
	}
	
	/**
	 * name
	 * @return name of student
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * grade
	 * @return grades of student
	 */
	
	public int getGrade() {
		return grade;
	}
	/**
	 * fees paid
	 * @return total fees paid by students
	 */
	public int getFeesPaid() {
		return feesPaid;
	}
	
	/**
	 * fees total
	 * @return total fees of student expense
	 */
	
	public int getFeesTotal() {
		return feesTotal;
	}
	
	/**
	 * to know what our remaining fee is
	 * @return remaining fees
	 */
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}
	
}