package demo614;

class ValHold {
	public int i = 0;
}

public class Test2 {
	public static void main(String[] args) {
		Test2 o = new Test2();
		o.amethod();
	}

	public void amethod() {
		int i = 99;
		ValHold v = new ValHold();
		v.i = 30;//从新赋值 i= 30
		System.out.println(v.i);//30
		
		System.out.println(v.toString());
		
		another(v, i);//v 99	
		
		System.out.println(v.toString());
		System.out.println(v.i);//20  被方法another（）重写
	
		
	}

	public void another(ValHold v, int i) {
		i = 0;// 99 > > 0
		v.i = 20;// i =20
		System.out.println(v.i);
		ValHold vh = new ValHold();
		v = vh;
		System.out.println(v.i);//0   这个 VH 对象的地址给了V   局部变量
		System.out.println(i);//0
	}
}