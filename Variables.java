package com.briup.ch06;

public class Variables

{  private int a = 1;//全局变量 非静态变量可以调用非静态变量   非静态可以调用静态  静态不能调用非静态变量
   public static void main(String[] args){
     Variables vrs = new Variables();
	 vrs.test1();
   }
   public void test1(){
     System.out.println("hello");
	      System.out.println("test1:"+a);
   }
}