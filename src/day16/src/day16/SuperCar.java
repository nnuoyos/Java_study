package day16;

public class SuperCar extends Car {
	String mode; //슈퍼카에만 존재하는 기능
	
	public SuperCar() {
		System.out.println("자식 클래스의 기본 생성자");
	}
	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand,color,price); //부모클래스 super 이름 뒤의 소괄호는 부모클래스의 생성자, 부모클래스Car를 불러옴
		//setPrice(price); //price는 초기화 할 때 생성자를 통해서 해도 되지만, setPrice를 통해서 해도 된다 (getter/setter)
		this.mode = mode; //mode는 슈퍼카에서만 추가된 메서드이므로 따로 초기화 해야 한다
		
	}
	
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	@Override
	void engineStop() {
		System.out.println("음성으로 시동 끔");
	}
	@Override
	public String toString() { //toString 재정의
		return "브랜드 : " + brand + "\n색상 : " + color + "\n가격" + getPrice() + "만원"; //toString의 리턴타입이 String이기 때문에 부모클래스에 있는 리턴타입과 매개변수는 건들 수 없다
	}
	//price 는 프라이빗이라서 getPrice() 이렇게 사용해준다
	
}
