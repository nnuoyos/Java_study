package day09;

import java.util.Scanner;

public class ArTest {
	//����Ʈ ���� ���� ���α׷�
	//1�� 
	//1ȣ 2ȣ 3ȣ
	//��տ����� �� ���� ���ϱ�
	public static void main(String[] args) {
		int [] ho = new int[3];
		int sum=0;
		double avg=0.0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < ho.length; i++) {
			System.out.println(i+1 + "ȣ ������ �Է��ϼ���(����:����)");
			ho[i]=sc.nextInt();
			//System.out.println(ho[i]);
		}
		
		for (int i = 0; i < ho.length; i++) {
			sum+=ho[i];
		}
		System.out.println("�� ����: " + sum +"����");
		avg = Double.parseDouble(String.format("%.2f",(double)sum/ho.length));
		System.out.println("��տ���:  "+avg +"����");
		
		
	}
}
