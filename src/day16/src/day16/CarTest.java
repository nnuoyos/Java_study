package day16;

public class CarTest {
	public static void main(String[] args) {
		//SuperCar superCar = new SuperCar();
		SuperCar ferrari = new SuperCar("ferrari", "Red", 45000, "sport");
		System.out.println(ferrari); //이렇게 출력하면 주소가 나온다 객체는 주소를 담기 때문에
		ferrari.engineStart();
		ferrari.engineStop();
	}
}
