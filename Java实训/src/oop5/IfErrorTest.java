package oop5;

import java.util.Scanner;

public class IfErrorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("�������䣺");// 130 max 
		/*
		 * �ж�������� ������Ϊ���� 130 ��С�� 0�� �ַ��������롣
		 */
		int age = input.nextInt();
		if (age >=60) {
			System.out.println("������");
		} else if (age >= 40) {
			System.out.println("������");
		} else if (age >= 20) {
			System.out.println("������");
		}else {
			System.out.println("����");
		}
		//������������С��20ʱ ��������κ���ʾ��
		//��������ķ�Χ���⡣
	}

}
