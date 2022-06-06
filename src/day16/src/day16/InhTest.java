package day16;

class A{
	int data=10;
	public A() {
		System.out.println("부모 클래스 생성자");
	}
	
	void show() {
		System.out.println("A 클래스");
	}
	
}

class B extends A{
	//부모 클래스의 메서드명과 똑같이 사용하고 싶을 때 오버라이드 (재정의)
	@Override
	void show() {
		System.out.println("B 클래스");
	}
	
	void check() {
		show(); //부모 클래스 상속해서 사용하기
	}
	
}

public class InhTest {
	public static void main(String[] args) {
		B instance =new B(); //B 타입의 객체 만들기
		instance.check(); 
	}
	
}
