package demo617;

interface IPrintInter {// �ӿ�
	public void print();
}

public class Demo1 {
	public static void main(String[] args) {
		fun(new IPrintInter() {// �����ڲ���
			@Override
			public void print() {
				System.out.println("Hello World!");
			}
		});
	}

	private static void fun(IPrintInter p) {//$1 ����
		p.print();// �ӿڻص�
	}
}