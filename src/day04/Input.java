package day04;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		String name=""; //�ʱ�ȭ
		String lastName="";
		Scanner sc = new Scanner(System.in); 
		//sca + ctrl + �����̽��� ������ �ڵ��ϼ� scannerŬ�������� ȣ�� ��!
		
		// .��ħǥ�� ���������� A.b : A�ȿ� b
		System.out.println("�̸��� �����Դϱ�?");
		 //���� �Է��� ���ڿ� ���� ���� 
//		name = sc.next();
//		lastName=sc.next();
		name=sc.nextLine();
		System.out.println(name);
		System.out.println(lastName);
		sc.close();
	}
}
