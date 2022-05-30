package baekjoon;

import java.util.Scanner;

public class B_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //과목 개수 입력
		double arrTest[] = new double [N];
		double M=0; //점수 중 최대값
		double avg=0.0;
		
		for(int i=0; i<arrTest.length; i++) {
			arrTest[i] = sc.nextInt(); //점수 입력 받기
			if(M<arrTest[i]) {
				M = arrTest[i];
			}
			//System.out.println("과목 점수: " + arrTest[i]); //출력 확인용
		}
		
		for(int j=0; j<arrTest.length; j++) {
			avg+=((arrTest[j]/M*100)/N); //새로운 평균 점수 구하기
		}
		
		System.out.println(avg);
		
		sc.close();
		
	}
}
