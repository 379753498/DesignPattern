package com.Wj.FactoryPattern;

public class PeopleFactory {

	/**
	 * 第一种普通工厂模式
	 * @param 国家
	 * @return  
	 * @Description:
	 */
	public People getPeople(String country) {
		if (country.equals("China")) {
			return new ChinaPeople();
		}

		if (country.equals("Japan")) {
			return new JapanPeople();
		}
		if (country.equals("America")) {
			return new AmericaPeople();
		} else {

			throw new Error(country + "People不存在");

		}

	}
	
	/**
	 * 
	 * -----------------------------------------------------------------------------------------------------
	 * 多个工厂方法模式
	 * @return  
	 * @Description:
	 */
	public People getChinaPeople() {
		return new ChinaPeople();
		
	}
	
	public People getJapanPeople() {
		return new JapanPeople();
		
	}
	public People getAmericaPeople() {
		return new AmericaPeople();
		
	}
	/**
	 * 
	 * -----------------------------------------------------------------------------------------------------	 */

	
	/**
	 * 静态工厂方式 无需实例化直接调用
	 * @return  
	 * @Description:
	 */
	public static People getStaticChinaPeople() {
		return new ChinaPeople();
		
	}
	
	public  static People getstaticJapanPeople() {
		return new JapanPeople();
		
	}
	public static People getstaticAmericaPeople() {
		return new AmericaPeople();
		
	}
	
}
