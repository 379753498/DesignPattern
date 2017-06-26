package com.xj.Builder;  

import java.util.List;
  
public class TestBuilder {

	/**
	 * 
	 * 建造者模式（Builder）

工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的。
	 * @param args  
	 * @Description:
	 */
	 
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	//创建10个日本人建造模式
	List<InterfacetoPeople>produceAmericaPeople = BuilderPeople.produceJapanPeople(10);
	
	for (InterfacetoPeople InterfacetoPeople : produceAmericaPeople)
	{
		InterfacetoPeople.eat();
		InterfacetoPeople.red();
	}
}
}
