package demo614;

import java.util.*;

public class BabyBoomer {
	private Date birthDate = new Date();
	
	Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	
	Date boomStart;// ����Date����
	// �ж��Ƿ���ĳ���׶���
	public boolean isBabyBoomer() {
		boomStart = cal.getTime();
		// ��ʼʱ��
		cal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);	
		// ����ʱ��
		cal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomEnd = cal.getTime();// ����Date����
		return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
	}
	
	public static void main(String[] args) {
		
		BabyBoomer bb =new BabyBoomer();
		
		
	}
}