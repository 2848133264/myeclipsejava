package demo617;

interface Inter {
	public abstract void show();

	public default void defaultPrint() {
		System.out.println("�ӿڵ�Ĭ�Ϸ���");
	}

	public static void staticPrint() {
		System.out.println("�ӿڵľ�̬����");
	}
}