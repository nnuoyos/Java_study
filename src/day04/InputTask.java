package day04;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
		int num1=0 , num2=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력해주세요. \n 예)1 2");
		num1=Integer.parseInt(sc.next());
		num2=Integer.parseInt(sc.next());
		
		System.out.println("결과: " +(num1+num2));
		//"결과: " +num1 문자열과 정수가 연결되면 통째로 문자열로 보기 때문에 
		//그 다음에 오는 정수도 문자열로 변환되어 연산이 아닌, 연결이 되어 나온다
		
	}
}
