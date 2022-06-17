package day10;

public class MethodTest {
	
	int add(int num1, int num2){
		System.out.println("add 메서드 입니다.");
		return num1+num2;
	}
	
	public static void main(String[] args) {
		//컴파일 하자마자 자동으로 실행되는 메서드가 바로 main메서드이다
		//add(3,7);
		//System.out.println(add(3,7));
		MethodTest m = new MethodTest();
		System.out.println(m.add(5, 7));
	}
}
