package demo614;

public class Test6 {
	static final int END = Integer.MAX_VALUE;//达到整数最大值时，会加+1，
	static final int START = END - 100;

	public static void main(String[] args) {
		
		int j = END -100;
		System.out.println(j);
		
		int count = 0;
		for (int i = START; i < END; i++) {
			count++;
			System.out.println(count+","+i);
		}
		//范围溢出，i 的值为负值，进入死循环。	让他正常，等于 = 去掉。
	}
}