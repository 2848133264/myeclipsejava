package PPT;

interface IFunction2<R> {
	public R upper();
}

public class MethodRefDemo2 {
	public static void main(String[] args) {
		// “hello”字符串是String类的实例对象
		// 将toUpperCase()函数式的引用交个了IFunction接口
		IFunction2<String> fun = "hello"::toUpperCase;
		String str = fun.upper();// 此次相当于"hello".toUpperCase()
		System.out.println(str);
	}
}