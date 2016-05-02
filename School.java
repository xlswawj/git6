package com.briup.ch06;

public class  School
{//1.私有属性
  private long id;
  private String name;
  private String address;
  //4.构造函数
  public School(){
  
  }
  public School(long id,String name,String address){
     this.id = id;
	 this.name = name;
	 this.address = address;
  }
  //2.提供公共的setter,getter方法
  public void setId(long id){
     this.id = id;
   
  }
  public long getId(){
     return this.id;
  }
  public void setName(String name){
     this.name = name;
  }
  public String getName(){
     return this.name;
  } 
  public void setAddress(String address){
     this.address = address;
  }
  public String getAddress(){
     return this.address;
  }
  public String toString(){
     return  "School[id:"+this.id+",name:"+this.name+",address:"+this.address+"]";
  }  
}