package day12;

public class Car {
	int price; //��������
	String color;
	String brand;
	
	//OverLoading 
	Car(){}
	
	//������(�޼����� ��ɰ� ����)
	public Car(int price, String color, String brand) {
		this.price = price; //�� ��ü�� price ���� �ܺο��� ���� ���� �ʱ�ȭ �ϴ� ��
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
		System.out.println("�귣�� : "+brand+ "\n����: "+color+ "\n����: " +price+ "����");
	}
	
	
	public static void main(String[] args) {
		//��üȭ
		//�ν��Ͻ� ����
		//Ŭ������() : �⺻ ������ 
		//Ŭ������ �����ϸ� �ڵ����� ����Ǵ� ������, ���� ���Ƿ� �����ڸ� �����ϸ� �̰� �⺻ �����ڰ� �ȴ�
		Car momCar = new Car(9000, "Black", "Benz"); //�����ڴ� �޼��尡 �ƴ�����, ����� ����
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
