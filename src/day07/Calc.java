package day07;

import java.util.Scanner;

/*
계산기 만들기
1. 계산하기

1 + 1 =>next는 공백을 기준으로 자른다 next를 세번 써야 함
2

2.나가기
*/
public class Calc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1=0, num2=0;
		int choice=0;
		String menuMsg="1.계산하기\n2.나가기";
		String oper=""; //초기화
		String result="";
		
		while(true) {
			System.out.println(menuMsg);
			choice=sc.nextInt(); //선택한 메뉴 변호
			if(choice==2) {
				System.out.println("종료");
				break; //2번은 나가기 메뉴 
			}
			if(choice!=1) continue; // 메뉴가 1번이 아닐 때만 다시 되돌아가기
			
			num1=Integer.parseInt(sc.next());
			oper = sc.next();
			num2=Integer.parseInt(sc.next());
			
			switch(oper) {
			case "+" :
				result=""+(num1+num2); // result = num1 + num2 라고 하면 int를 담기 때문에 형변환을 해준다
				break;
			case "-" :
				result=""+(num1-num2);
				break;
			case "*" :
				result=""+(num1*num2);
				break;
			case "/" :
				if(num2 != 0) {
					result=""+(num1/num2);
				}
				else {
					result = "0으로 나눌 수 없습니다";
				}
				break;
				default:
					result ="사칙연산 외의 연산자는 사용 할 수 없습니다";
			}
			System.out.println(result);
		}
		sc.close();
	}
}
