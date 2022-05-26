package day12;

public class OverLoading {
	//오버로딩의 기능? 매개변수의 개수가 다르거나 이름이 같더라도 구분점이 생긴다
	//이름을 같게 해도 컴파일러는 전달한 값의 개수로 구분할 수 있다
	void add(int num1, int num2) {
		System.out.println("두 정수의 합");
		System.out.println(num1+num2);
	}
	
	void add(int num1, int num2, int num3) {
		System.out.println("세 정수의 합");
		System.out.println(num1+num2+num3);
	}
	
	void add(double num1, double num2) {
		System.out.println("두 실수의 합");
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		OverLoading o = new OverLoading();
		o.add(10, 20);
		o.add(10.5, 20.9);
		o.add(1, 2, 3);
	}
}
