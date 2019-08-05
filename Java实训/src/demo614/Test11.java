package demo614;

interface Inter {
}

class A {
}

class B extends A implements Inter {
}

public class Test11 extends B {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		Test11 c = new Test11();
		if (a instanceof B) {//false
			System.out.println("Hello A");
		}
		if (b instanceof A) {//true
			System.out.println("Hello B");
		}
		if (c instanceof Test11) {//true
			System.out.println("Hello C");
		}
		if (c instanceof Inter) {//true
			System.out.println("Hello I");
		}
	}
}