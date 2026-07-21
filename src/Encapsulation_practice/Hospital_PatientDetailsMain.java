package Encapsulation_practice;

public class Hospital_PatientDetailsMain {
	
	public static void main(String[] args) {
		
		Hospital_PatientDetails h = new Hospital_PatientDetails();
		h.setPatientName("Ram");
		h.setPatientAge(25);
		h.setDisease("Dengue");
		h.setDoctorFees(25000);
		
	    System.out.println(h.getPatientName());
	    System.out.println(h.getPatientAge());
	    System.out.println(h.getDisease());
	    System.out.println(h.getDoctorFees());
		  
	}

}
