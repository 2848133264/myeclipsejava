package oop5;

public class task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 
	* ʹ��ѭ����1�ӵ�1000
	* ���ṩ������������ʵ�ַ�ʽ
	* �Լ��Աȷ������ַ�ʽ������(��ʱ���ڴ�ȷ���)
	* 
		 */
		
		System.out.println("����һ��");
		long timestart = System.nanoTime();
		method1(1000);
		System.out.println(System.nanoTime()-timestart);
		
		System.out.println("��������");
		long M_timestart_2 = System.nanoTime();
		method2(1000);
		System.out.println(System.nanoTime()-M_timestart_2);
		
		System.out.println("��������");
		long M_timestart_3 = System.nanoTime();
		method3(1000);;
		System.out.println(System.nanoTime()-M_timestart_3);
		
		System.out.println("�����ģ�");
		long M_timestart_4 = System.nanoTime();
		method4(1000);;
		System.out.println(System.nanoTime()-M_timestart_4);
	}
	static int  method1(int n){
		//forѭ����
		int sum = 0;
		for(int i = 1;i<=n;i++){
			sum +=i;
		}
		return sum;
	}
	static int method2(int n){
		return (n * (1 + n ))/2;
	}
	static int method3(int n){
		int sum =0;
		do {
			sum +=n;
			n--;
		} while (n>0);
		return sum;
	}
	static int method4(int n){
		int sum = 0;
		while(n >0){
			sum +=n;
			n--;
		}
		return sum;
	}

}
