package demo617;

public class Demo2 {
	public static void main(String[] args) {
		fun(() -> System.out.println("Hello World!"));
	}

	private static void fun(IPrintInter p) {
		p.print();
	}
}