package demo614;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test5 {
	public static void main(String[] args) throws IOException {
		String readTxt = new Test5().readFile("M:\\list.txt");
		System.out.println(readTxt);
	}

	//没有关闭操作，但是这个Try（） 会自动释放资源，关闭资源。
	public String readFile(String path) throws IOException {
		// 资源在代码执行完自动释放
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			
			StringBuilder builder = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				builder.append(line);
				builder.append(String.format("%n"));
			}
			return builder.toString();
		}
	}
}