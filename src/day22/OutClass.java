package day22;

public class OutClass {
	int outData;
	
	public OutClass() {
		System.out.println("외부 클래스 생성자 호출 됨");
	}
	
	public void showOuter() {
		System.out.println("외부 클래스의 메서드 호출 됨");
	}
	
	public class InnerClass{ //내부 클래스 선언 후 외부에 있는 필드들에 접근하기
		int inData;
		
		public InnerClass() {
			System.out.println("내부클래스의 생성자 호출 됨");
		}
		
		public void showInner() {
			outData=20;
			
			System.out.println("내부클래스의 메서드 호출 됨");
			System.out.println("outData: "+outData);
			showOuter();
		}
	}
	public static void main(String[] args) {
		OutClass out = new OutClass();
		//외부클래스명.내부클래스명 객체명 = 외부클래스객체명.new 내부클래스 생성자();
		OutClass.InnerClass in = out.new InnerClass(); //이렇게 해야 내부클래스에 접근 할 수 있다
		in.showInner();
	}
	
}
