package task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class Write {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file =new File("M:/read.txt");
		RandomAccessFile accessFile =new RandomAccessFile(file, "rw");
		String  name =null;
		int age =0;
		name ="zhangsan";
		age =30 ;
		accessFile.writeBytes(name);
		accessFile.writeInt(age);
		name ="lisi    ";
		age  =31;
		accessFile.writeBytes(name);
		accessFile.writeInt(age);
		name ="wangwu  ";
		age = 32;
		accessFile.writeBytes(name);
		accessFile.writeInt(age);
		accessFile.close();
		System.out.println("–¥»Î≥…π¶...");
	}

}
