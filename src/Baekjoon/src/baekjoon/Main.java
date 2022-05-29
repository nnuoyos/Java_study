package baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //test �Է� �ޱ�
		
		int[][] APT = new int[15][15]; //1<=k,n<=14
		
		for(int i=0; i<15; i++) {
			APT[i][1]=1; //i��1ȣ�� ���� 1�� �ʱ�ȭ
			APT[0][i]=i; //0���� iȣ �ʱ�ȭ
		}
			
		for (int i = 1; i < 15; i++) { //1������ 14������
			for (int j = 2; j <15; j++) { //2ȣ���� 14ȣ����
				APT[i][j]=APT[i][j-1]+APT[i-1][j];	
			}
		}
	
		
		for(int i=0; i<T; i++) {
			
		int k = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(APT[k][n]);
		}
	
		sc.close();
	
	}
}

