package single;

public class Stadium {
	public static void main(String[] args) {
		//IronMan i = new IronMan(); 
		//private���� ���������Ƿ� Stadium���� IronMan�� ����� �� ����! �����߻�
		
		IronMan i = IronMan.getInstance();
		//��ü�� ���� �� ��� ���� ���� ����� ���� getInstance ���
		//�� �� i�� �� �ϳ����� Ŭ���� �ȿ� �ִ� �� ��ü�̴�
		
		IronMan.fight(); //Ŭ������ ���� �����Ѵ�
		i.walk();
	}
}
