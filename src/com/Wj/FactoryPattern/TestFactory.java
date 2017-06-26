package com.Wj.FactoryPattern;  
  
public class TestFactory {
	
	
	public static void main(String[] args) {
		
		//普通工厂模式
		PeopleFactory PeopleFactory =new PeopleFactory();
		String china="China";
		String Japan="Japan";
		String America="America";
		
		People chinapeople =PeopleFactory.getPeople(china);
		chinapeople.eat();
		chinapeople.red();
		People Japanpeople =PeopleFactory.getPeople(Japan);
		Japanpeople.eat();
		Japanpeople.red();
		
		People Americapeople =PeopleFactory.getPeople(America);
		Americapeople.eat();
		Americapeople.red();
		// _____________________________________________________________________________________
		//多个工厂方法模式
		PeopleFactory p =new PeopleFactory();
		People jp =p.getJapanPeople();
		jp.eat();
		jp.red();
		// _____________________________________________________________________________________
		//静态工厂方法模式 推荐
		
		People jp2 =PeopleFactory.getJapanPeople();
		jp2.eat();
		jp2.red();
		
	}
	
}
