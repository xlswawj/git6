package com.briup.ch06;

public class Test
{//保存江西理工大学的信息
	public static void main(String[] args){
		/**
		实例化过程
		1.将School类加载到内存中
		2.根据School类在堆内存中开辟内存空间
		3.jvm对对象的属性进行初始化
		4.调用构造函数对对象进行初始化
		5.将堆内存中的首地址返回
		*/
	     School sc1 = new School();
		 sc1.setId(1001L);
		 sc1.setName("江西理工大学");
         sc1.setAddress("江西南昌");
	     System.out.println(sc1);

		 School sc2 = new School(1002L,"华东交通大学","江西南昌...");
		 System.out.println(sc2);
	}
 
}

