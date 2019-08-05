package demo614;

public class Test13 {
	static boolean foo(char c) {
		System.out.print(c);
		return true;
	}

	public static void main(String[] args) {
		int i = 0;
		for (foo('1'); foo('2') && (i < 2); foo('4')) {
			i++;
			foo('3');
		}
	}//ABDCBDCB
}