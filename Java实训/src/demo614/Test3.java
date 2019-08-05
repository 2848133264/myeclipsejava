package demo614;

import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		
		//如何突破泛型检查，在编译时传递非泛型的类型？？
	}
    //通配符，上线   和 下限通配符。
	public static <E> void read(List<? extends E> list) {//问号，是E这个类型的子类型。
		int sum = 0;
		for (E obj : list) {
			// 业务逻辑操作
		}
	}//做查询操作的时候，使用上限通配符

	public static void write(List<? super Number> list) {//传入的是 Number的父类型的，传入比Number更大的值。
		// 加入一个元素
		list.add(123);
		list.add(new Integer(123));
		
	}//做数据修改操作的时候，使用下限通配符。
}