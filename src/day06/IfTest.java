package day06;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n1Msg= "ù��° ���� : ";
		String n2Msg= "�ι�° ���� : ";
		int num1=0, num2=0;
		
		System.out.printf(n1Msg);
		num1=sc.nextInt();
		
		System.out.printf(n2Msg);
		num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println("ù��° ������ �� Ů�ϴ�");
		}
		else if(num1==num2) {
			System.out.println("�� ������ �����ϴ�");
		}
		else {
			System.out.println("�ι�° ������ �� Ů�ϴ�");
		}
		
		
	}
}
