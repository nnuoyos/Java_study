package day16;

public class CarTest {
	public static void main(String[] args) {
		//SuperCar superCar = new SuperCar();
		SuperCar ferrari = new SuperCar("ferrari", "Red", 45000, "sport");
		System.out.println(ferrari); //�̷��� ����ϸ� �ּҰ� ���´� ��ü�� �ּҸ� ��� ������
		ferrari.engineStart();
		ferrari.engineStop();
	}
}
