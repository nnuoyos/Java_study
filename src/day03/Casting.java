package day03;

public class Casting {
	public static void main(String[] args) { // 메서드-메인

		String num1 = "1";
		String num2 = "2";
		int num3 = 3;

		// 자동 형변환
		System.out.println(11 / 9);
		System.out.println(11 / 9.0);
		// 값의 끝에 1.2222222222222223 으로 3으로 끝나는 것은 실수의 오류이다 무한소수이므로

		// 강제 형변환(Casting)
		System.out.println((double) 11 / 9);
		System.out.println((int) 8.43 + 2.59);
		System.out.println((int) (8.43 + 2.59));
		// 최우선연산자 먼저 연산 된 후에 강제형변환이 이뤄진다. 따라서 덧셈 후에 정수로 형변환 됨 11
		System.out.println((int) 8.43 + (int) 2.59);
		// 형변환을 먼저 하고 나서 두 수가 연산 된다 따라서 10

		// 문자열 형변환
		System.out.println(num1 + num2);
		// 문자열 더하기 문자열은 연결!
		// String은 일반 타입이 아니라서, 클래스타입으로 형변환이 가능하다 int의 클래스타입은 뭘까요
		System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
		System.out.println(""+num3+9); //정수를 문자열로 바꾸는 방식
		
	}
}
