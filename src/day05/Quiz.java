package day05;

import java.util.Scanner;

public class Quiz {
	/*
		Q.������ ���α׷��� �� �ƴ� ����
		1.JAVA
		2.Python
		3.C���
		4.���վ�		
	 */
	public static void main(String[] args) {
		String q = "Q. ������ ���α׷��� �� �ƴ� ����?\n"
				+ "1. JAVA\n"
				+ "2.Python\n"
				+ "3.C���\n"
				+ "4.���վ�\n";
		Scanner sc= new Scanner(System.in);
		int choice = 0;
		int answer =4; //���� ������ ������� ������ ���� ������ ����
		String result = "";
		
		System.out.println(q);
		choice = sc.nextInt();
		
		//System.out.println(choice==4 ? "����" : "����");
		//choice == 4 ��� ���� �ٷ� ����ִ°� ���� 4��� ���� ������ ������� ����ϴ� ���� ����
		
		//System.out.println(choice==answer ? "����" : "����");
		
		result = choice==answer ? "����" : choice >= 1 && choice <=4? "����" : "�߸��Է��ϼ̽��ϴ�";
		System.out.println(result);
		
		
		
	}
}
