package demo614;

import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		
		//���ͻ�Ʒ��ͼ�飬�ڱ���ʱ���ݷǷ��͵����ͣ���
	}
    //ͨ���������   �� ����ͨ�����
	public static <E> void read(List<? extends E> list) {//�ʺţ���E������͵������͡�
		int sum = 0;
		for (E obj : list) {
			// ҵ���߼�����
		}
	}//����ѯ������ʱ��ʹ������ͨ���

	public static void write(List<? super Number> list) {//������� Number�ĸ����͵ģ������Number�����ֵ��
		// ����һ��Ԫ��
		list.add(123);
		list.add(new Integer(123));
		
	}//�������޸Ĳ�����ʱ��ʹ������ͨ�����
}