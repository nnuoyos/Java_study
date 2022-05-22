package day06;

public class Oper {
	public static void main(String[] args) {
		int money = 1_000_000_000; //큰 숫자를 표기할 때는 언더바로 구분한다
		int data=10;
		money += 50_000_000;
		
		//data += 1;
		//data++;
		System.out.println(data++); //후위형
		System.out.println(++data); //전위형
	}
}
