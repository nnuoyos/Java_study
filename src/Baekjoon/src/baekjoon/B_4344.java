package baekjoon;

import java.util.Scanner;

public class B_4344 {
	//백준_평균은 넘겠지
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Tcase = sc.nextInt(); //테스트 개수 입력

		 

		
		for(int i=0; i<=Tcase; i++) {
			int [] N = new int[sc.nextInt()]; //학생수 입력 받기
			int sum=0;
			int avg=0;
			int cnt=0;
			double passAvg=0;
		
			for(int j=0; j<N.length; j++) {
				
				N[j]= sc.nextInt();
				sum+=N[j]; //점수 누적 => 평균
			}
			
			avg=sum/(N.length);
			
			for(int k=0; k<N.length; k++) {
				if(N[k]>avg) {
					cnt++;
				}
			}
			passAvg = (double)cnt / N.length*100;
			System.out.println(String.format("%.3f", passAvg)+"%"); 
			//평균 넘는 학생 비율 구하기 [특정값/전체값 * 100 = 비율]
		}
		sc.close();

	}
}

