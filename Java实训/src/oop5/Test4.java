package oop5;

import java.util.Random;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("����ֵ��" + Const.RAND_CONST);
		//Const.RAND_CONST = 100;// ���У�˵����ʱ��ֵ��static ������
	}
}
/* �ӿڳ��� */

interface Const {
	// ������
	public static final int RAND_CONST = new Random().nextInt();
	// ���� Random ÿ��ִ�е�ʱ��ֵ�ǻ�仯�ġ�
}