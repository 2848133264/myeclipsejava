package demo614;

public class Test8 {
	private static int x = 100;
    static  double y =6.5;//c++ �᲻һ����Java�п���
	public static void main(String[] args) {
		
		
		Test8 hs1 = new Test8();
		System.out.println(hs1.toString());
		hs1.x++;

		
		Test8 hs2 = new Test8();
		hs2.x++;
		System.out.println(hs2.toString());
		hs1 = new Test8();
	
		
		System.out.println(hs1.toString());
		hs1.x++;		
		Test8.x++;

		
		System.out.println("X:" + x);
		
		//ִ�����д��봴���˼�������,����x���ڶ��٣�
		//3 ��104
		//static  ��������ֵ���������ʱ��static�� �ͻᱻ���� ����ֻ�ᱻ����һ�Ρ���̬���ε�����ֵ���Բ�ͨ��new���󣬿�ʹ������.���ʾ�̬���ԡ�
	}
}