package demo617;

interface Inter {
	public abstract void show();

	public default void defaultPrint() {
		System.out.println("接口的默认方法");
	}

	public static void staticPrint() {
		System.out.println("接口的静态方法");
	}
}