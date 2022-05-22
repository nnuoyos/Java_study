package day05;

import java.util.Scanner;

public class Quiz {
	/*
		Q.다음중 프로그래밍 언어가 아닌 것은
		1.JAVA
		2.Python
		3.C언어
		4.망둥어		
	 */
	public static void main(String[] args) {
		String q = "Q. 다음중 프로그래밍 언어가 아닌 것은?\n"
				+ "1. JAVA\n"
				+ "2.Python\n"
				+ "3.C언어\n"
				+ "4.망둥어\n";
		Scanner sc= new Scanner(System.in);
		int choice = 0;
		int answer =4; //값을 변수에 저장시켜 놓으면 추후 관리가 쉽다
		String result = "";
		
		System.out.println(q);
		choice = sc.nextInt();
		
		//System.out.println(choice==4 ? "정답" : "오답");
		//choice == 4 라고 값을 바로 집어넣는것 보다 4라는 값을 변수에 저장시켜 사용하는 것이 좋다
		
		//System.out.println(choice==answer ? "정답" : "오답");
		
		result = choice==answer ? "정답" : choice >= 1 && choice <=4? "오답" : "잘못입력하셨습니다";
		System.out.println(result);
		
		
		
	}
}
