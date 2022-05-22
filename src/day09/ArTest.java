package day09;

import java.util.Scanner;

public class ArTest {
	//아파트 월세 관리 프로그램
	//1동 
	//1호 2호 3호
	//평균월세와 총 월세 구하기
	public static void main(String[] args) {
		int [] ho = new int[3];
		int sum=0;
		double avg=0.0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < ho.length; i++) {
			System.out.println(i+1 + "호 월세를 입력하세요(단위:만원)");
			ho[i]=sc.nextInt();
			//System.out.println(ho[i]);
		}
		
		for (int i = 0; i < ho.length; i++) {
			sum+=ho[i];
		}
		System.out.println("총 월세: " + sum +"만원");
		avg = Double.parseDouble(String.format("%.2f",(double)sum/ho.length));
		System.out.println("평균월세:  "+avg +"만원");
		
		
	}
}
