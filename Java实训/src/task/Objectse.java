package task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Objectse {

	
	public static void main(String[] args) throws Exception {
		
		File file = new File("M:/user.dat");
		if (!file.exists()) {
			file.createNewFile();
		}
		write(file);
		read(file);
	}

	@SuppressWarnings("unchecked")
	private static void read(File file) throws Exception {
		// TODO Auto-generated method stub
		ObjectInputStream o =new ObjectInputStream(new FileInputStream(file));
		
		List<User> list =new ArrayList<>();	
		list = (List<User>) o.readObject();	
		//输出读取信息。
		for (User user : list) {
			System.out.println(user);
		}
		o.close();
		
	}

	private static void write(File file) throws Exception{
		// TODO Auto-generated method stub
		ObjectOutputStream o =new ObjectOutputStream(new FileOutputStream(file));
		//users
		User user = new User("zhangsan",30);
		User user1 = new User("lisi",31);
		User user2 = new User("wangwu",32);
		//存在一个集合中
		List<User> list =new ArrayList<>();
		
		list.add(user);
		list.add(user1);
		list.add(user2);
		
		o.writeObject(list);
		//关闭
		o.close();
		System.out.println("写入成功");
		
	}
	
}
