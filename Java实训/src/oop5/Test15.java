package oop5;

import java.io.IOException;

public class Test15 {
	public static void main(String[] args) {
		try {
			DBBase base = new MySQLDB();
		} 
		catch (IOException e) { // �쳣����
			System.err.println("DFSAFADF");} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class DBBase {// ����
	// �����׳�IOException
	public DBBase() throws IOException {
		throw new IOException();
	}
}

class MySQLDB extends DBBase {// ����
	// �����׳�Exception�쳣
	public MySQLDB() throws Exception {
	}
}