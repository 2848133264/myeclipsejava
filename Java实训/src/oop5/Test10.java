package oop5;

public class Test10 {
	public static void main(String[] args) {
		Father base = new Son();// ���÷Ǿ�̬����
		base.notStatic();// ���þ�̬����
		base.doTest();
	}
}

class Father {// ���ྲ̬����
	public static void doTest() {
		System.out.println("���Ǹ��ྲ̬����");
	}

	public void notStatic() { // ����Ǿ�̬����
		System.out.println("���Ǹ���Ǿ�̬����");
	}
}

class Son extends Father { // ����ͬ����ͬ�����ľ�̬����
	public static void doTest() {
		System.out.println("�������ྲ̬����");
	}

	public void notStatic() {// ��д����ķǾ�̬����
		System.out.println("��������Ǿ�̬����");
	}
}