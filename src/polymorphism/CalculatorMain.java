package polymorphism;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println("Sum of Two integers --> " + cal.add(22, 22));
		System.out.println("Sum of Three integers --> " + cal.add(11, 10, 20));
	}

}
