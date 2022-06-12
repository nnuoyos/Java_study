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
		System.out.println("����� �õ� Ŵ");
	}
	
	void engineStop() {
		System.out.println("����� �õ� ��");
	}
}


//�θ� ��� ���� �ڽ� Ŭ����
class SuperCar extends Car{
	String mode;

	//�⺻ ������
	public SuperCar() {
	}
	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price); //�θ������ �޾ƿ���
		this.mode = mode;
	}
	
	void changeMode(String newMode) {
		this.mode = newMode;
		System.out.println("��尡 �ٲ�����ϴ�");
	}
	
	@Override //������
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
	}
	
	@Override
	void engineStop() {
		System.out.println("�������� �õ� ��");
	}
	
	
}




public class CastingTest {
	public static void main(String[] args) {
		//up casting �ڽ� �����ڸ� �ҷ���
		Car noOptionFerrari = new SuperCar();
		//noOptionFerrari.engineStart();
		//noOptionFerrari ���� �õ��� �Ѹ� �����ϱ� �����ϱ�?
		//�θ�Ÿ��������, �ڽ� Ŭ�������� �����ǵ� ������ŸƮ �޼��尡 �ִٸ� ������ �� �޼���� ����� �ȴ�. ���� �������� �õ� Ŵ!
		
		
		//down casting : ����
//		SuperCar brokenCar = (SuperCar) new Car();
//		brokenCar.changeMode("������");
	
		
		Car car = new Car();
		SuperCar ferrari = new SuperCar();
		
		//car�� ���̴�. ���� car�� ���� Car�ڵ��� Ÿ���̴�? ���� ��
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
		//Ÿ���� �ڵ��� Ÿ��. ��ĳ������ �ص� Ÿ�Ը� �´ٸ� �´�
		
	}
}




















