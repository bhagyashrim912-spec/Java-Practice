package Encapsulation_practice;

public class LaptopDetailsMain {
	
	public static void main(String[] args) {
		
		LaptopDetail l = new LaptopDetail();
		l.setBrand("HP");
		l.setModel("HP Victus 15");
		l.setPrice(45000);
		
		System.out.println(l.getBrand());
		System.out.println(l.getModel());
		System.out.println(l.getPrice());

		
	}

}
