package day16;

public class Car {
	final int wheel=4; //�ڵ��� ���� ���� ����! �ܺο��� �������� ���ϵ��� ��� ���� final
	public String brand;
	protected String color;
	private int price;

	public Car() {
		System.out.println("�θ� Ŭ������ �⺻ ������");
	}

	public Car(String brand, String color, int price) {//�ʱ�ȭ
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
	
	//price�� ������ �� �ֵ��� �ϱ� ���� getter / setter (���� �ϵ�, ������ �� �� �ְ�!) art+shift+s>r
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}

