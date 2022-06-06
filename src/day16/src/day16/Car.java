package day16;

public class Car {
	final int wheel=4; //자동차 바퀴 수는 고정! 외부에서 변경하지 못하도록 상수 선언 final
	public String brand;
	protected String color;
	private int price;

	public Car() {
		System.out.println("부모 클래스의 기본 생성자");
	}

	public Car(String brand, String color, int price) {//초기화
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
	
	//price에 접근할 수 있도록 하기 위해 getter / setter (경고는 하되, 접근은 할 수 있게!) art+shift+s>r
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}

