package Encapsulation_practice;

public class LoginSystemMain {
	
	public static void main(String[] args) {
		
		LoginSystem l = new LoginSystem();
		l.setEmail("rampawar123@gmail.com");
		l.setMobileNo(987656789);
		l.setPassword("Ram@123");
		
		System.out.println(l.getEmail());
		System.out.println(l.getMobileNo());
		System.out.println(l.getPassword());

	}

}
