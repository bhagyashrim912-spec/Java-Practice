package com.Interface;

public class Main {

	public static void main(String[] args) {

		Animal a1;
		Animal a2;
		a1 = new Dog();
		a1.eat();
		a1.sound();

		a2 = new Cat();
		a2.eat();
		a2.sound();

		
		
		Employee e;
		e = new Developer();
		e.work();
		e.role();

		e = new Tester();
		e.work();
		e.role();
		
		
		Vehical v;
		v = new Car();
		v.name();
		v.price();
		
		v = new Jeep();
		v.name();
		v.price();
		
		
		Payment p;
		p = new UPI();
		p.pay(20000);
		
		p = new Cash();
		p.pay(25000);
		
		
		
		Shape s;
		s = new Circle();
		s.area();
	    System.out.println("Area = " + s.area());
	    
	    
	    Student st;
	    st = new Student1();
	    System.out.println(st.name());
	    System.out.println(st.id());
	    
	    st = new Student2();
	    System.out.println( st.name());
	    System.out.println(st.id());
	
	}

}
