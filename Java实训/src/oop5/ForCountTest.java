package oop5;

public class ForCountTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("i��ֵ=" + i); // i = 0  1
			i *= 0.1;//     i = i*0.1;      �Զ�ת��������   0.1  == 0 
			/*
			 * ѭ������ȷ��
			 * ��Ϊ i ���������͵ģ��ڵ�һ�� i Ϊ�� �����  i = 0��  i *=0.1 ��ʱ�� Ϊ�㣬
			 * �ڶ���ѭ����ʱ��i =1�� i *=0.1 ��ʱ�� ͬ��Ϊ�㣬����ʱ��i Ϊ 1��֮���ظ� �ڶ���ѭ��
			 */
		}
	}
}