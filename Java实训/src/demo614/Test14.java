package demo614;

import java.math.BigInteger;

public class Test14 {
	public static void main(String[] args) {
		BigInteger fiveThousand = new BigInteger("5000");
		
		BigInteger fiftyThousand = new BigInteger("50000");
		
		BigInteger fiveHundredThousand = new BigInteger("500000");
		
		BigInteger total = BigInteger.ZERO;
		
		total = total.add(fiveThousand);//要接收一下
		total = total.add(fiftyThousand);
		total = total.add(fiveHundredThousand);
		
		
		System.out.println(total);
	}
}