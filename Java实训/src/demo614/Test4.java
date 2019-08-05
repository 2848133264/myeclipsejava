package demo614;

import java.io.File;

public class Test4 {
	public static void main(String[] args) {
		String path = "M:/home/xxx";
		new File(path).mkdir();//不会创建多个文件夹，只能单个
		//new File(path).mkdirs();//会创建多个文件夹
	}
}