package polymorphism;

public class Calculate {

	public void calculate(int n) {
		System.out.println("Square = " + (n * n));
	}

	public void calculate(double n) {
		System.out.println("Cube = " + (n * n * n));
	}

}
