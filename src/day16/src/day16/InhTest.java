package day16;

class A{
	int data=10;
	public A() {
		System.out.println("�θ� Ŭ���� ������");
	}
	
	void show() {
		System.out.println("A Ŭ����");
	}
	
}

class B extends A{
	//�θ� Ŭ������ �޼����� �Ȱ��� ����ϰ� ���� �� �������̵� (������)
	@Override
	void show() {
		System.out.println("B Ŭ����");
	}
	
	void check() {
		show(); //�θ� Ŭ���� ����ؼ� ����ϱ�
	}
	
}

public class InhTest {
	public static void main(String[] args) {
		B instance =new B(); //B Ÿ���� ��ü �����
		instance.check(); 
	}
	
}
