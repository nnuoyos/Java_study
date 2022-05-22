package day05;

public class OperTest {
	public static void main(String[] args) {
		System.out.println(10 == 20); 
		System.out.println(10 == 10 && 20 > 30);
		System.out.println(10 == 10 || 20 > 30); //둘 중 하나라도 참이면 트루 
		System.out.println(!(10 > 30)); 
		//not 연산자 거짓이면 참, 참이면 거짓: 10>30 이 거짓이므로 트루!
	}
}
