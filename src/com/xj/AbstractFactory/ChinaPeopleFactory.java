package com.xj.AbstractFactory;  
  
public class ChinaPeopleFactory implements InterfacetoFactory {

	@Override
	public InterfacetoPeople produce() {
		// TODO Auto-generated method stub  
		return new ChinaPeople();
	}

}
