package day04;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
		int num1=0 , num2=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 2���� �Է����ּ���. \n ��)1 2");
		num1=Integer.parseInt(sc.next());
		num2=Integer.parseInt(sc.next());
		
		System.out.println("���: " +(num1+num2));
		//"���: " +num1 ���ڿ��� ������ ����Ǹ� ��°�� ���ڿ��� ���� ������ 
		//�� ������ ���� ������ ���ڿ��� ��ȯ�Ǿ� ������ �ƴ�, ������ �Ǿ� ���´�
		
	}
}
