package PPT;

interface IPrintInter {// 接口
	public void print();
}

public class Demo1 {
	public static void main(String[] args) {
		fun(new IPrintInter() {// 匿名内部类
			@Override
			public void print() {
				System.out.println("Hello World!");
			}
		});
	}

	private static void fun(IPrintInter p) {
		p.print();// 接口回调
	}
}