package task;

class counts implements Runnable {

	int sum = 0;// ��ʾ�ܵ�Ǯ�������������
	int temp1 = 0;// ��ʾ������ʱ��
	int temp2 = 0;// ��ʾ������ʱ��

	/**
	 * 
	 * 1,��ȷ��Щ�����Ƕ��߳����д���,��д��run()���� 2,��ȷʲô�ǹ������ݡ� 3,��ȷ���߳����д�������Щ����ǲ����������ݵġ�
	 */

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for (int i = 0; i < 3; i++) {// ��ʾ������
				if (sum < 6000) {
					sum += 1000;
					if (Thread.currentThread().getName().equals("����һ")) {
						temp1 += 1000;
						try {
							Thread.sleep(10*24*60*60);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + "Ŀǰ����" + temp1+"��");
					} else {
						temp2 += 1000;
						System.out.println(Thread.currentThread().getName() + "Ŀǰ����" + temp2+"��");
					}
				}
				System.out.println("��ǰ���˻����Ϊ��"+sum+"��");
			}
		}
	}

}

public class CountSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		counts c = new counts();
		Thread t1 = new Thread(c, "����һ");
		Thread t2 = new Thread(c, "������");
		t1.start();
		t2.start();
	}

}
