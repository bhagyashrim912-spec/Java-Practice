package polymorphism;

public class Sum_Main {
	
	public static void main(String[] args) {
		
		Sum s  = new Sum();
		System.out.println("Sum of integers: " + s.sum(12, 12));
		System.out.println("Sum of floats: " + s.sum(12.12f, 10.10f));
	}

}
