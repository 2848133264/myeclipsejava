package PPT;
/**
* ʵ�ַ��������ýӿ�
* @param <T> ���÷����Ĳ�������
* @param <R> ���÷����ķ���ֵ����
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