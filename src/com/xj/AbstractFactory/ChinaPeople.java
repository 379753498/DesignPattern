package com.xj.AbstractFactory;  
  
public class ChinaPeople implements InterfacetoPeople {

	@Override
	public void eat() {

		System.out.println("This is China people eat method!");
	}

	@Override
	public void red() {
	
		System.out.println("This is China people red method!");
	}

}
