package com.briup.ch06;

public class Test
{//���潭������ѧ����Ϣ
	public static void main(String[] args){
		/**
		ʵ��������
		1.��School����ص��ڴ���
		2.����School���ڶ��ڴ��п����ڴ�ռ�
		3.jvm�Զ�������Խ��г�ʼ��
		4.���ù��캯���Զ�����г�ʼ��
		5.�����ڴ��е��׵�ַ����
		*/
	     School sc1 = new School();
		 sc1.setId(1001L);
		 sc1.setName("��������ѧ");
         sc1.setAddress("�����ϲ�");
	     System.out.println(sc1);

		 School sc2 = new School(1002L,"������ͨ��ѧ","�����ϲ�...");
		 System.out.println(sc2);
	}
 
}

