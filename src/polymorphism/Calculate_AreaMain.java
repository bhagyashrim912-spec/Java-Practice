package polymorphism;

public class Calculate_AreaMain {
	
	public static void main(String[] args) {
		
		Calculate_Area ca = new Calculate_Area();
		
		System.out.println("Area of Circle: " + ca.area(5.0));
        System.out.println("Area of Rectangle: " + ca.area(10, 20));
		}

}
