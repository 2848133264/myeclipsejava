package PPT;

import java.util.function.Supplier;

public class FunctionDemo3 {
	public static void main(String[] args) {
		Supplier<String> sup = "Hello"::toUpperCase;
		System.out.println(sup.get());
	}
}