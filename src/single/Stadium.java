package single;

public class Stadium {
	public static void main(String[] args) {
		//IronMan i = new IronMan(); 
		//private으로 막혀있으므로 Stadium에서 IronMan을 사용할 수 없다! 오류발생
		
		IronMan i = IronMan.getInstance();
		//객체로 만들어서 점 찍고 싶을 때는 만들어 놨던 getInstance 사용
		//이 때 i는 단 하나뿐인 클래스 안에 있는 그 객체이다
		
		IronMan.fight(); //클래스로 직접 접근한다
		i.walk();
	}
}
