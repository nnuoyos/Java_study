package day16;

public class VariableTest2 {
	public static void main(String[] args) {
		VariableTest vt = new VariableTest(); 
		//객체화
		//VariableTest(클래스: 추상적 개념)을 실체화 시키는 객체: vt
		vt.f();
		vt.f();
		vt.f();
		vt.f2();
		vt = new VariableTest(); //new를 만나 다시 초기화 된다
		vt.f(); //data는 초기값 0으로 나온다
	}
}
