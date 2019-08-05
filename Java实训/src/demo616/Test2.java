package demo616;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list =new ArrayList();
		list.add(120);
		list.add(15);
		list.add("95");
		
		Iterator it =list.iterator();
		while(it.hasNext()){
			Object object =it.next();//j
			if ("95".equals(object)) {
//				list.remove(object);
//				break;
				
				it.remove();//此方法可以
				
			}
			//System.out.println(object);
		}
		System.out.println(list);
	}

}
