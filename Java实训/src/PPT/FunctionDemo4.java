package PPT;

import java.util.function.Predicate;


//断言型接口(Predicate)示例
public class FunctionDemo4 {
	public static void main(String[] args) {
		Predicate<String> pre = "Hello"::equalsIgnoreCase;
		System.out.println(pre.test("HELLO"));
	}
}