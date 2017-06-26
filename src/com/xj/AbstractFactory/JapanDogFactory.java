package com.xj.AbstractFactory;  
  
public class JapanDogFactory implements InterfacetoFactory {

	@Override
	public InterfacetoPeople produce() {
		// TODO Auto-generated method stub  
		return new JapanPeople();
	}

}
