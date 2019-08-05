package demo614;

public class Test8 {
	private static int x = 100;
    static  double y =6.5;//c++ 会不一样，Java中可以
	public static void main(String[] args) {
		
		
		Test8 hs1 = new Test8();
		System.out.println(hs1.toString());
		hs1.x++;

		
		Test8 hs2 = new Test8();
		hs2.x++;
		System.out.println(hs2.toString());
		hs1 = new Test8();
	
		
		System.out.println(hs1.toString());
		hs1.x++;		
		Test8.x++;

		
		System.out.println("X:" + x);
		
		//执行下列代码创建了几个对象,最终x等于多少？
		//3 ，104
		//static  声明属性值，在类加载时，static块 就会被调用 ，并只会被调用一次。静态修饰的属性值可以不通过new对象，可使用类名.访问静态属性。
	}
}