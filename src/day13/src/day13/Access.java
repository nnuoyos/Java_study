package day13;

public class Access { //앞에 public이 붙어있는 것은 하나의 프로젝트 내에서 모두가 접근 가능 패키지가 달라도 접근 가능 
	int data1=10; //디폴트 접근 권한 제어자
	public int data2 =20;
	protected int data3= 30;
	private int data4= 40;
	
	public int getData4() { //모든곳에서 접근 가능하도록 public
		return data4; //get이므로 리턴타입 돌려준다 따라서 void 가 아닌 int형으로 작성
	}
	
	void f() {
	}
}

//Cloud 클래스의 메서드에서 Access 에 있는 필드에 접근하기
class Cloud{ 
	void function() {
		Access a = new Access(); //Access객체화 하여 접근하기 
		
	}
}
