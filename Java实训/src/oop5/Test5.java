package oop5;

public class Test5 {
	public static void main(String[] args) {
		int i = 80;
		String s = String.valueOf(i < 100 ? 90 : 100); // s  = 90
		String s1 = String.valueOf(i < 100 ? 90 : 100.0); // s1 = 90.0 
		System.out.println(s.toString()+",");
		
		System.out.println(s1.toString());
		System.out.println("�����Ƿ���ȣ�" + s.equals(s1));
		
		/*
		 * ���ص���ֵ��ͬ��
		 * ���ʽ�и���������
		 */
	}
	
}