package day16;

public class SuperCar extends Car {
	String mode; //����ī���� �����ϴ� ���
	
	public SuperCar() {
		System.out.println("�ڽ� Ŭ������ �⺻ ������");
	}
	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand,color,price); //�θ�Ŭ���� super �̸� ���� �Ұ�ȣ�� �θ�Ŭ������ ������, �θ�Ŭ����Car�� �ҷ���
		//setPrice(price); //price�� �ʱ�ȭ �� �� �����ڸ� ���ؼ� �ص� ������, setPrice�� ���ؼ� �ص� �ȴ� (getter/setter)
		this.mode = mode; //mode�� ����ī������ �߰��� �޼����̹Ƿ� ���� �ʱ�ȭ �ؾ� �Ѵ�
		
	}
	
	@Override
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
	}
	
	@Override
	void engineStop() {
		System.out.println("�������� �õ� ��");
	}
	@Override
	public String toString() { //toString ������
		return "�귣�� : " + brand + "\n���� : " + color + "\n����" + getPrice() + "����"; //toString�� ����Ÿ���� String�̱� ������ �θ�Ŭ������ �ִ� ����Ÿ�԰� �Ű������� �ǵ� �� ����
	}
	//price �� �����̺��̶� getPrice() �̷��� ������ش�
	
}
