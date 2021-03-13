package studentInfo;

public class Student {
	private int id;
	private int rollNo;
	private String subject;
	private String password;
	public static int studentCounter;
	
	
	public Student()
	{
		studentCounter++;
	   System.out.println("Empty constructor called");
	}
	
	public String getPassword(int pin) {
		if(pin == 1234) {
			return this.password;
		}
		return "ACCESS_DENIED";
		
	}
	
	public boolean setPassword(int pin, String password) {
		if(pin == 1234) {
			this.password = password;
			return true;
		} else {
			return false;
		}
		
	}
	public static int getStudentcount() {
		
		return studentCounter;
		// TODO Auto-generated method stub

	}
	

	public int getStudentId() {
		return this.id;
		// TODO Auto-generated method stub

	}
	public int getStudentRollNo() {
		return this.rollNo;
		// TODO Auto-generated method stub

	}
	public String getStudentSubject() {
		return this.subject;
		// TODO Auto-generated method stub

	}
	
	public void setStudentnId(int id) {
		 this.id=id;
		// TODO Auto-generated method stub

	}
	public void setStudentRollNo(int rollno) {
		 this.rollNo=rollno;
		// TODO Auto-generated method stub

	}
	public void setStudentSubject(String subj) {
		 this.subject=subj;
		// TODO Auto-generated method stub

	}
	
	
}
