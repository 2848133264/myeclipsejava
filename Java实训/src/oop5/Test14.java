package oop5;

public class Test14 {
	public static void main(String[] args) {
		Person p = new Person(17);
		p.seeMovie();
	}
}

class Person {
	public Person(int _age) {
		if (_age < 18) {
			throw new RuntimeException("����������18�ꡣ");
		}
		/*
		 * ��Ҫ�ٹ��췽��������쳣�׳�
		 */
	}

	public void seeMovie() {
		System.out.println("�����Ƽ���Ӱ");
	}
}