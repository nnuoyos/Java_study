package day09;

import java.util.Iterator;
import java.util.Scanner;

public class ArShop {
	//����� ���ϱ�
	//zara 
	//������, �ڿ�����, ����
	//����: �鸸�� 
	//��, ��� ������� ���� �������� ����Ѵ�. �Ҽ��� 2° �ڸ� ����
	public static void main(String[] args) {

		int [] arIncome = new int[3];
		String [] arName= {"������","�ڿ�����","����"};
		int sum=0;
		int cnt=0;
		double avg=0.0;
		String best = "����"; //�ʱⰪ�� �������� �ϱ�, �ش��ϴ� ���� ������ if���� ���� �ʴ´�
		Scanner sc = new Scanner(System.in);
				
		for (int i = 0; i < arIncome.length; i++) {
			System.out.println(arName[i] + "������� �Է��ϼ���: (����:�鸸��)");
			arIncome[i]=sc.nextInt();
			sum+=arIncome[i];
		}
		
		avg=Double.parseDouble(String.format("%.2f", (double)sum/ arIncome.length));
		System.out.println("zara �� ����� : "+ sum + "�鸸��");
		System.out.println("��� ����� : " + avg + "����");
		
		
	
		for (int i = 0; i < arIncome.length; i++) {
			if(arIncome[i]>avg) {
				cnt++;
				if(cnt==1) best=""; //�� ó������ �ѹ� �ʱ�ȭ �ϱ�
				
				best += arName[i] + "\n";
			}
		}
		System.out.println("���μ�Ƽ�� �����\n" + best);
		
	}
}
