package polymorphism;

public class MultiplyMain {

	public static void main(String[] args) {

		Multiply m = new Multiply();
		System.out.println("Multiply of Two int Values --> " + m.multiply(12, 4));
		System.out.println("Multiply of Two int Values --> " + m.multiply(12.60, 4.80));
	}

}
