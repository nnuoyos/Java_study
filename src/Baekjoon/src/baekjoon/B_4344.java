package baekjoon;

import java.util.Scanner;

public class B_4344 {
	//����_����� �Ѱ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Tcase = sc.nextInt(); //�׽�Ʈ ���� �Է�

		 

		
		for(int i=0; i<=Tcase; i++) {
			int [] N = new int[sc.nextInt()]; //�л��� �Է� �ޱ�
			int sum=0;
			int avg=0;
			int cnt=0;
			double passAvg=0;
		
			for(int j=0; j<N.length; j++) {
				
				N[j]= sc.nextInt();
				sum+=N[j]; //���� ���� => ���
			}
			
			avg=sum/(N.length);
			
			for(int k=0; k<N.length; k++) {
				if(N[k]>avg) {
					cnt++;
				}
			}
			passAvg = (double)cnt / N.length*100;
			System.out.println(String.format("%.3f", passAvg)+"%"); 
			//��� �Ѵ� �л� ���� ���ϱ� [Ư����/��ü�� * 100 = ����]
		}
		sc.close();

	}
}

