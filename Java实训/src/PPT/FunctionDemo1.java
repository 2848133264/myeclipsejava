package PPT;

import java.util.function.Function;

public class FunctionDemo1 {
	public static void main(String[] args) {
		Function<String, Boolean> fun = "##hello"::startsWith;
		System.out.println(fun.apply("##"));
	}
}