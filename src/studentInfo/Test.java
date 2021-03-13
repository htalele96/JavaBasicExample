package studentInfo;

public class Test {

	public static void main(String[] args) {
		Student stud = new Student();
		
//		stud.setStudentnId(2);
//		int studentId=stud.getStudentId();
//		System.out.println(studentId);
//	
//		stud.setStudentRollNo(25);
//		int studentRoll=stud.getStudentRollNo();
//		System.out.println(studentRoll);
//		
//		stud.setStudentSubject("Math");
//		String studentsubj=stud.getStudentSubject();
//		System.out.println(studentsubj);
		
		boolean isSet = stud.setPassword(1234, "password");
		System.out.println(isSet);
		
		System.out.println(stud.getPassword(1122));
		System.out.println(stud.getPassword(1234));
		
		Student stud2 = new Student();
		//System.out.println(stud2.getStudentcount());
		System.out.println(Student.getStudentcount());
		System.out.println(Student.studentCounter);
	}
	

}