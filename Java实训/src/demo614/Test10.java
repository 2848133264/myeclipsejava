package demo614;

public class Test10 {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operate(a, b);
		System.out.println(a + "," + b);
	}

	private static void  operate(StringBuffer x, StringBuffer y) {
		x.append(y);
		y = x;
		
	}
	//AB ��B
}