package demo614;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test5 {
	public static void main(String[] args) throws IOException {
		String readTxt = new Test5().readFile("M:\\list.txt");
		System.out.println(readTxt);
	}

	//û�йرղ������������Try���� ���Զ��ͷ���Դ���ر���Դ��
	public String readFile(String path) throws IOException {
		// ��Դ�ڴ���ִ�����Զ��ͷ�
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