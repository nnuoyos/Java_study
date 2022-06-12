package day18;

class Car{
	String brand;
	String color;
	int price;
	
	public Car() {
		
	}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
	
	void engineStop() {
		System.out.println("열쇠로 시동 끔");
	}
}


//부모를 상속 받은 자식 클래스
class SuperCar extends Car{
	String mode;

	//기본 생성자
	public SuperCar() {
	}
	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price); //부모생성자 받아오기
		this.mode = mode;
	}
	
	void changeMode(String newMode) {
		this.mode = newMode;
		System.out.println("모드가 바뀌었습니다");
	}
	
	@Override //재정의
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	@Override
	void engineStop() {
		System.out.println("음성으로 시동 끔");
	}
	
	
}




public class CastingTest {
	public static void main(String[] args) {
		//up casting 자식 생성자를 불러옴
		Car noOptionFerrari = new SuperCar();
		//noOptionFerrari.engineStart();
		//noOptionFerrari 에서 시동을 켜면 음성일까 열쇠일까?
		//부모타입일지라도, 자식 클래스에서 재정의된 엔진스타트 메서드가 있다면 재정의 된 메서드로 사용이 된다. 따라서 음성으로 시동 킴!
		
		
		//down casting : 오류
//		SuperCar brokenCar = (SuperCar) new Car();
//		brokenCar.changeMode("스포츠");
	
		
		Car car = new Car();
		SuperCar ferrari = new SuperCar();
		
		//car는 값이다. 따라서 car의 값이 Car자동차 타입이니? 묻는 것
		if(car instanceof Car) {
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");
		}
		
		if(ferrari instanceof Car) {
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");
		}
		
		if(car instanceof SuperCar) {
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");
		}
		
		if(noOptionFerrari instanceof Car) {
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");
		}
		//타입이 자동차 타입. 업캐스팅을 해도 타입만 맞다면 맞다
		
	}
}




















