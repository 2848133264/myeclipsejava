package task;

class counts implements Runnable {

	int sum = 0;// 表示总的钱数，共享的数据
	int temp1 = 0;// 表示的是临时的
	int temp2 = 0;// 表示的是临时的

	/**
	 * 
	 * 1,明确哪些代码是多线程运行代码,须写入run()方法 2,明确什么是共享数据。 3,明确多线程运行代码中哪些语句是操作共享数据的。
	 */

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for (int i = 0; i < 3; i++) {// 表示的三次
				if (sum < 6000) {
					sum += 1000;
					if (Thread.currentThread().getName().equals("储户一")) {
						temp1 += 1000;
						try {
							Thread.sleep(10*24*60*60);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + "目前存了" + temp1+"￥");
					} else {
						temp2 += 1000;
						System.out.println(Thread.currentThread().getName() + "目前存了" + temp2+"￥");
					}
				}
				System.out.println("当前的账户余额为："+sum+"￥");
			}
		}
	}

}

public class CountSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		counts c = new counts();
		Thread t1 = new Thread(c, "储户一");
		Thread t2 = new Thread(c, "储户二");
		t1.start();
		t2.start();
	}

}
