package com.xj.AbstractFactory;  
  
public class AmericaPeopleFactory implements InterfacetoFactory {

	@Override
	public InterfacetoPeople produce() {
		// TODO Auto-generated method stub  
		return new AmericaPeople();
	}

}
