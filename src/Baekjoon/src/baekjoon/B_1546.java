package baekjoon;

import java.util.Scanner;

public class B_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //���� ���� �Է�
		double arrTest[] = new double [N];
		double M=0; //���� �� �ִ밪
		double avg=0.0;
		
		for(int i=0; i<arrTest.length; i++) {
			arrTest[i] = sc.nextInt(); //���� �Է� �ޱ�
			if(M<arrTest[i]) {
				M = arrTest[i];
			}
			//System.out.println("���� ����: " + arrTest[i]); //��� Ȯ�ο�
		}
		
		for(int j=0; j<arrTest.length; j++) {
			avg+=((arrTest[j]/M*100)/N); //���ο� ��� ���� ���ϱ�
		}
		
		System.out.println(avg);
		
		sc.close();
		
	}
}
