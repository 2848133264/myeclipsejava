package demo617;

interface I{
	
	public void show(String var);
	//public int addsum(int a,int b);
}

public class demo03 implements I{

	public static void main(String[] args) {
		
	   fun((s) ->System.out.println(s));
	   // �൱�ڣ�show��string S����system.out.println(s);��һ����
	   //���д����ô�{}
	   
	   fun((s) ->{
		   for(int i = 0;i<5;i++){
		    System.out.println(i+":"+s);
		   }
	   });
	   
	}
	
	public static void fun(I i){
		i.show("test");
	}

	@Override
	public void show(String var) {
		// TODO Auto-generated method stub
		
	}

	
}
