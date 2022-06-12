package single;

public class IronMan {
	
	//싱글턴패턴은 new를 하면 안되기 때문에 생성자를 private으로 막아준다. 객체를 더이상 만들수 없게끔
	private IronMan() {}
	
	//외부에서 클래스로 직접 접근할 때는 static이 메모리에 자동으로 올라가게 해줘야 하기 때문에 static을 붙여준다
	public static IronMan getInstance() { //getInstance : 객체를 얻어온다
		IronMan im = new IronMan();
		return im; 
	}
	
	public static void fight() {
		System.out.println("빔 발사");
	}
	
	public void walk() {
		System.out.println("날아간다");
	}
	
}
