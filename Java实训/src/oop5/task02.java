package oop5;

public class task02 {

	/**
	�ַ���ƴ�������ַ�ʽ
	//�Ӻ�ƴ��
	str+="c"��
	//concat��������
	str=str.concat("c");
	new StringBuilder("a").append("c");
	
	Ҫ��:
	�ֱ��¼����ƴ��10W�ε�ʱ����ڴ�����
	����������ƴ�ӵײ�ԭ��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "",str2 ="";
		StringBuffer str3 =new StringBuffer("");
		long start1 = System.nanoTime();//��ʼʱ��
		for(int i= 0;i<100000;i++){
			//�Ӻ�ƴ��
			str1 +="c";
		}
		System.out.println("�Ӻ�ƴ�ӵ�ʱ�䣺"+(System.nanoTime() - start1));
		
		
		long start2 = System.nanoTime();//��ʼʱ��
		for(int i= 0;i<100000;i++){
			//concat
			str2 =str2.concat("c");
		}
		System.out.println("concat ƴ�����ĵ�ʱ�䣺"+(System.nanoTime() - start2));
		
		long start3 = System.nanoTime();//��ʼʱ��
		for(int i= 0;i<100000;i++){
			//concat
			str3 =str3.append("c");
		}
		System.out.println("stringbuffer ƴ�����ĵ�ʱ�䣺"+(System.nanoTime() - start3));
	}

}
