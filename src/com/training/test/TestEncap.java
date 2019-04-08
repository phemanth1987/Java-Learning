package com.training.test;

import examples.java.EncapsulationExp; 

public class TestEncap {

	public static void main(String[] args) {

		EncapsulationExp en = new EncapsulationExp();
		en.setFname("Jam");
		en.setLName("Bond");
		en.setPhno(1234567);
		en.setAge(30);
		
		System.out.println(en.getFname() + " "+ en.getLName());

		
		
	}

}
