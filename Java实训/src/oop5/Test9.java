package oop5;

public class Test9 {
	
	
	public static int i = 1;
	
	static {
		i = 100;
		System.out.println("aaaaaaaaaaa");//�洢��ȫ�����������ȹ��췽�����ȼ��ء�
		}
	// ˳��ִ�У��������    i
	public static void main(String[] args) {
		System.out.println(i);
		new Test9();//ֻ��ʼ��һ��
	}
}