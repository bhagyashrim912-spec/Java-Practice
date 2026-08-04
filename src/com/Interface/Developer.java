package com.Interface;

public class Developer implements Employee {

	@Override
	public void work() {
		System.out.println("Developer writes Code");
		
	}

	@Override
	public void role() {
		System.out.println("Backend Developer");
		
	}
	

}
