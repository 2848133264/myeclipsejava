package PPT;

import java.util.function.Predicate;


//�����ͽӿ�(Predicate)ʾ��
public class FunctionDemo4 {
	public static void main(String[] args) {
		Predicate<String> pre = "Hello"::equalsIgnoreCase;
		System.out.println(pre.test("HELLO"));
	}
}