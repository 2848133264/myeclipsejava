package oop5;

public class task05 {

	/**
	 *
	˾�����ű���,������ͼ����ɸã�
	��������˾�������ܿ�����,���ܿ�����BMW,����ô�޸���ƣ�
	˾�������������ܿ�,������Ҳ�ܿ�,����ô��������������������ʵ�ֻ��ǳ���
	 */
	//ʵ��һ���ӿڡ�
	public static void main(String[] args) {
		new Driver().benchi();
		new Driver().runBMW();
		new Driver().othercar();
	}
}
class Driver extends Car{
	
	void Driver(){
		
	}

	@Override
	public void runBMW() {
		// TODO Auto-generated method stub
		System.out.println("����Լ�ʻ BMW");
	}

	@Override
	public void benchi() {
		// TODO Auto-generated method stub
		System.out.println("����Լ�ʻ benchi");	
	}

	@Override
	public void othercar() {
		// TODO Auto-generated method stub
		System.out.println("����Լ�ʻ��������ĳ��ӡ�");
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}
}
abstract class Car implements TypeCar{
	abstract void run();
}
interface TypeCar{
	void runBMW();
	void benchi();
	void othercar();
}