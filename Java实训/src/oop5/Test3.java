package oop5;

public class Test3 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			count = count++;//count++ ��ֵ������
			//  ��Ϊ  ��count ++��
		}
		System.out.println("count=" + count);
	}
	/*
	 * count  = 0��
	 * ���� count ++ ����ʹ�ã���һ��count = 0��
	 */
}