package task;

import java.io.File;
import java.io.RandomAccessFile;

public class randomAccessFile {
	
	public static void main(String[] args) throws Exception{
		
		
		//�����ļ��Ķ�ȡҪ
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
		System.out.println("��һ�˵���Ϣ:"+name+";"+age);
		for(int i = 0;i<b.length;i++){
			b[i] =accessFile.readByte();//��ȡһ���ֽ�
		}
		name =new String(b);
		age = accessFile.readInt();//��ȡ����
	
		System.out.println("�ڶ��˵���Ϣ:"+name+";"+age);
		
		for(int i = 0;i<b.length;i++){
			b[i] =accessFile.readByte();
		}
		name = new String(b);
		age =accessFile.readInt();
		System.out.println("�����˵���Ϣ:"+name+";"+age);
		accessFile.close();
	}
	
	
	

}
