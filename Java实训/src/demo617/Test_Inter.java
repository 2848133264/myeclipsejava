package demo617;

public class Test_Inter implements Inter{
	public static void main(String[] args) {
		
		Test_Inter  test_Inter =new Test_Inter();
		test_Inter.defaultPrint();
		test_Inter.show();
		Inter.staticPrint();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show method");
	}

}
