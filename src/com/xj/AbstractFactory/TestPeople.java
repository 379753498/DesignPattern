package com.xj.AbstractFactory;

public class TestPeople {

	public static void main(String[] args) {

		//抽象工厂模式 将接口实现工厂 作为工厂的一部分InterfacetoFactory 总工厂
		InterfacetoFactory InterfacetoFactory = new JapanDogFactory();
		//InterfacetoPeople 获取InterfacetoFactory 实现类JapanDogFactory 中produce 方法返回JapanPeople对象   而JapanPeople 就是InterfacetoPeople 的实现类
		//可以向上转型；
		InterfacetoPeople InterfacetoPeople = InterfacetoFactory.produce();
		
		InterfacetoPeople.eat();
		InterfacetoPeople.red();
		

	//其实好处 就拓展比如说我要增加英国人吃饭和 先实现InterfacetoPeople 接口；在做一个工厂类；实现InterfacetoFactory即可；无需去改动现成的代码。这样做，拓展性较好！
	
	}
}
