package oop5;

import java.util.Arrays;

public class Test13 {
	public static void main(String[] args) {
		String[] strs = { "Z ������s��",  "W ����(w)" ,"L ����(s)"};
		// ����,Ĭ��������
		Arrays.sort(strs);// 
		char  z = '��';
		System.out.println((int)z);  // sma
		int i = 0;
		for (String str : strs) {
			System.out.println((++i) + "��" + str);
		}
	}
}