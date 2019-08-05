package task;

import java.io.File;
import java.io.RandomAccessFile;

public class randomAccessFile {
	
	public static void main(String[] args) throws Exception{
		
		
		//首先文件的读取要
		File file =new File("M:/read.txt");
		RandomAccessFile accessFile = new RandomAccessFile(file, "r");		
		String name = null;
		int age =0;		
		byte b[] =new byte[8];
		for(int i = 0;i<b.length;i++){
			b[i] =accessFile.readByte();
		}
		name = new String(b);
		age =accessFile.readInt();	
		System.out.println("第一人的信息:"+name+";"+age);
		for(int i = 0;i<b.length;i++){
			b[i] =accessFile.readByte();//读取一个字节
		}
		name =new String(b);
		age = accessFile.readInt();//读取数字
	
		System.out.println("第二人的信息:"+name+";"+age);
		
		for(int i = 0;i<b.length;i++){
			b[i] =accessFile.readByte();
		}
		name = new String(b);
		age =accessFile.readInt();
		System.out.println("第三人的信息:"+name+";"+age);
		accessFile.close();
	}
	
	
	

}
