package PPT;

interface IFunction2<R> {
	public R upper();
}

public class MethodRefDemo2 {
	public static void main(String[] args) {
		// ��hello���ַ�����String���ʵ������
		// ��toUpperCase()����ʽ�����ý�����IFunction�ӿ�
		IFunction2<String> fun = "hello"::toUpperCase;
		String str = fun.upper();// �˴��൱��"hello".toUpperCase()
		System.out.println(str);
	}
}