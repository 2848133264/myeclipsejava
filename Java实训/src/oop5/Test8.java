package oop5;

public class Test8 {
	public static void main(String[] args) {
		ImplInterface.ts.methodTS();// ���ýӿڵ�ʵ��
	}
}// ��ʵ�ֵĽӿ�

interface ITest {
	public void methodTS();
}// �ڽӿ��д���ʵ�ִ���

interface ImplInterface {
	public static final ITest ts = new ITest() {
		public void methodTS() {
			System.out.println("���ڽӿ���ʵ����");
		}
	};
   
	
}