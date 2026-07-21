package Encapsulation_practice;

public class Student_Main {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setStdName("Abhi");
		s.setStdRollNo(56);
		
		System.out.println(s.getStdName());
		System.out.println(s.getStdRollNo());
	}

}
