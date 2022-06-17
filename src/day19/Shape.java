package day19;

public abstract class Shape {
	double area;
	
	abstract void showArea(double w, double h); // {} body가 없으므로 앞에 abstract 붙여준다
	
	//메서드에 파이널을 붙이면 절대 재정의 할 수 없다 => 자식 클래스에서 재정의x, 사용만 하라는 목적
	final void function() {
		System.out.println("추상 클래스의 일반 메서드 입니다");
	}
}

//사각형 넓이 구하기
class Rect extends Shape{
	@Override
	void showArea(double w, double h) {
		area = w*h;
		System.out.println("넓이: "+area+"cm²");
	}
}

//삼각형 넓이 구하기
class Tri extends Shape{
	@Override
	void showArea(double w, double h) { //넓이를 구하라는 강제성 재정의!
		area = (w*h)/2;
		System.out.println("삼각형 넓이: "+area+"cm²");
	}
}


