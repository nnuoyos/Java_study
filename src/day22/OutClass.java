package day22;

public class OutClass {
	int outData;
	
	public OutClass() {
		System.out.println("�ܺ� Ŭ���� ������ ȣ�� ��");
	}
	
	public void showOuter() {
		System.out.println("�ܺ� Ŭ������ �޼��� ȣ�� ��");
	}
	
	public class InnerClass{ //���� Ŭ���� ���� �� �ܺο� �ִ� �ʵ�鿡 �����ϱ�
		int inData;
		
		public InnerClass() {
			System.out.println("����Ŭ������ ������ ȣ�� ��");
		}
		
		public void showInner() {
			outData=20;
			
			System.out.println("����Ŭ������ �޼��� ȣ�� ��");
			System.out.println("outData: "+outData);
			showOuter();
		}
	}
	public static void main(String[] args) {
		OutClass out = new OutClass();
		//�ܺ�Ŭ������.����Ŭ������ ��ü�� = �ܺ�Ŭ������ü��.new ����Ŭ���� ������();
		OutClass.InnerClass in = out.new InnerClass(); //�̷��� �ؾ� ����Ŭ������ ���� �� �� �ִ�
		in.showInner();
	}
	
}
