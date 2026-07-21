package Encapsulation_practice;

public class Hospital_PatientDetails {

	private String patientName;
	private int patientAge;
	private String disease;
	private int doctorFees;

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getDoctorFees() {
		return doctorFees;
	}

	public void setDoctorFees(int doctorFees) {
		this.doctorFees = doctorFees;
	}

}
