package day13;

public class Access { //�տ� public�� �پ��ִ� ���� �ϳ��� ������Ʈ ������ ��ΰ� ���� ���� ��Ű���� �޶� ���� ���� 
	int data1=10; //����Ʈ ���� ���� ������
	public int data2 =20;
	protected int data3= 30;
	private int data4= 40;
	
	public int getData4() { //�������� ���� �����ϵ��� public
		return data4; //get�̹Ƿ� ����Ÿ�� �����ش� ���� void �� �ƴ� int������ �ۼ�
	}
	
	void f() {
	}
}

//Cloud Ŭ������ �޼��忡�� Access �� �ִ� �ʵ忡 �����ϱ�
class Cloud{ 
	void function() {
		Access a = new Access(); //Access��üȭ �Ͽ� �����ϱ� 
		
	}
}
