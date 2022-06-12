package single;

public class IronMan {
	
	//�̱��������� new�� �ϸ� �ȵǱ� ������ �����ڸ� private���� �����ش�. ��ü�� ���̻� ����� ���Բ�
	private IronMan() {}
	
	//�ܺο��� Ŭ������ ���� ������ ���� static�� �޸𸮿� �ڵ����� �ö󰡰� ����� �ϱ� ������ static�� �ٿ��ش�
	public static IronMan getInstance() { //getInstance : ��ü�� ���´�
		IronMan im = new IronMan();
		return im; 
	}
	
	public static void fight() {
		System.out.println("�� �߻�");
	}
	
	public void walk() {
		System.out.println("���ư���");
	}
	
}
