package PPT;

interface IFunction3<T> {
	public int compare(T t1, T t2);
}

public class MethodRefDemo3 {
	public static void main(String[] args) {
		IFunction3<String> fun = String::compareTo;
		// ��������ǰ����Ҫ�������,���ǽ����������˷�����
		System.out.println(fun.compare("k", "C"));
	}
}