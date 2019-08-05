package demo617;

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

	private static void fun(IPrintInter p) {//$1 类名
		p.print();// 接口回调
	}
}