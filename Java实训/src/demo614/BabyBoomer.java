package demo614;

import java.util.*;

public class BabyBoomer {
	private Date birthDate = new Date();
	
	Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	
	Date boomStart;// 创建Date对象
	// 判断是否是某个阶段人
	public boolean isBabyBoomer() {
		boomStart = cal.getTime();
		// 开始时间
		cal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);	
		// 结束时间
		cal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomEnd = cal.getTime();// 创建Date对象
		return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
	}
	
	public static void main(String[] args) {
		
		BabyBoomer bb =new BabyBoomer();
		
		
	}
}