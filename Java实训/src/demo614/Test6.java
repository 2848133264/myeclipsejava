package demo614;

public class Test6 {
	static final int END = Integer.MAX_VALUE;//�ﵽ�������ֵʱ�����+1��
	static final int START = END - 100;

	public static void main(String[] args) {
		
		int j = END -100;
		System.out.println(j);
		
		int count = 0;
		for (int i = START; i < END; i++) {
			count++;
			System.out.println(count+","+i);
		}
		//��Χ�����i ��ֵΪ��ֵ��������ѭ����	�������������� = ȥ����
	}
}