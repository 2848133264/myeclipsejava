package PPT;
/**
* 实现方法的引用接口
* @param <T> 引用方法的参数类型
* @param <R> 引用方法的返回值类型
*/
interface IFunction<T,R>{
public R apply(T t);
}
public class MethodRefDemo1 {
	public static void main(String[] args) {
		IFunction<Integer, String> fun = String::valueOf;
		String str = fun.apply(10030);
		System.out.println(str.replaceAll("0", "6"));
	}
}