package demo614;

import java.io.File;

public class Test4 {
	public static void main(String[] args) {
		String path = "M:/home/xxx";
		new File(path).mkdir();//���ᴴ������ļ��У�ֻ�ܵ���
		//new File(path).mkdirs();//�ᴴ������ļ���
	}
}