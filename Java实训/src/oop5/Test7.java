package oop5;

class Base {// ����
	void fun(int price, int... discounts) {
		System.out.println("Base����fun");
	}
}

class Sub extends Base {// ����,��д���෽��
	void fun(int price, int discounts) {
		System.out.println("Sub����fun");
	}
}

public class Test7 {
	public static void main(String[] args) {
		Base base = new Sub();// ����ת��	
		base.fun(100, 50);	
		base.fun(100, null);
		//�漰����Ķ�̬�ԣ�����ģ����������ҵ����Ӧ�ķ�������̬�󶨣�֮��ת�������顣		
		Sub sub = new Sub();// ��ת��		
//		sub.fun(100,new int[]{50});   //���ݲ�ƥ��
		sub.fun(100,50);   //���ݲ�ƥ��

	}
}