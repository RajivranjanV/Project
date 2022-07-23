package org.test;

public class Desktop implements Hardware,Software {

	@Override
	public void softwareResource() {
		System.out.println("softwareResourse use in IT field");
		
	}

	@Override
	public void hardwareResource() {
		System.out.println("hardware is used in manufacturing field");
		
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.softwareResource();
		d.hardwareResource();
		
		System.out.println("page2");
	}

}
