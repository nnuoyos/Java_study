package day04;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		String name=""; //초기화
		String lastName="";
		Scanner sc = new Scanner(System.in); 
		//sca + ctrl + 스페이스바 누르면 자동완성 scanner클래스까지 호출 됨!
		
		// .마침표는 하위연산자 A.b : A안에 b
		System.out.println("이름이 무엇입니까?");
		 //내가 입력한 문자열 값이 담긴다 
//		name = sc.next();
//		lastName=sc.next();
		name=sc.nextLine();
		System.out.println(name);
		System.out.println(lastName);
		sc.close();
	}
}
