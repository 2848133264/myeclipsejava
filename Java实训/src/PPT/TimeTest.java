package PPT;

import java.time.Clock;
import java.time.LocalDateTime;

public class TimeTest {
	public static void main(String[] args) {
		
//		final Clock clock = Clock.systemUTC();
//		
//		System.out.println(clock.instant());
//		
//		System.out.println(clock.millis());
//		
//		final LocalDateTime datetime = LocalDateTime.now();
//		
//		final LocalDateTime datetimeFromClock = LocalDateTime.now(clock);
//		
//		System.out.println(datetime);
//		
//		System.out.println(datetimeFromClock);
		Clock clock =Clock.systemUTC();
		
		//���ص��ǣ�System.currentTimeMillis()
		System.out.println(clock.millis());
		
		System.out.println(clock.instant());
		LocalDateTime dateTime =LocalDateTime.now(clock);//��ȡϵͳ���ڵ�ʱ��
		System.out.println(dateTime);
		
	}
}