package day12;

public class Car {
	int price; //전역변수
	String color;
	String brand;
	
	//OverLoading 
	Car(){}
	
	//생성자(메서드의 기능과 같다)
	public Car(int price, String color, String brand) {
		this.price = price; //그 객체의 price 내가 외부에서 받은 값을 초기화 하는 것
		this.color = color;
		this.brand = brand;
	}
	
	double speedUp(double speed){
		speed++;
		return speed;
	}
	

	double speedDown(double speed){
		speed--;
		return speed;
	}
	
	void showInfo() {
		System.out.println(this);
		System.out.println("브랜드 : "+brand+ "\n색상: "+color+ "\n가격: " +price+ "만원");
	}
	
	
	public static void main(String[] args) {
		//객체화
		//인스턴스 변수
		//클래스명() : 기본 생성자 
		//클래스를 선언하면 자동으로 선언되는 생성자, 내가 임의로 생성자를 선언하면 이게 기본 생성자가 된다
		Car momCar = new Car(9000, "Black", "Benz"); //생성자는 메서드가 아니지만, 기능은 같다
		momCar.showInfo();
		Car daddyCar = new Car();
		Car myCar = new Car();
		
//		momCar.brand="Benz";
//		momCar.color="Black";
//		momCar.price=9000;
//		
//		momCar.showInfo();
//		System.out.println(momCar);
//		
//		daddyCar.showInfo();
		
	}
	
}
