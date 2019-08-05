package demo614;

public class Test7 {
	public static void main(String[] args) {
		System.out.println(findResult());
	}

	private static boolean findResult() {
		try {
			return true;
		} catch (Exception e) {
			return true;
		} finally {
			return false;
			//false  ，finally 一定是最后执行的。
		}
	}
}