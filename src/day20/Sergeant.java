package day20;
//Army �� Adapter
public class Sergeant extends Army{
	@Override
	public void eat() {
		System.out.println("�ȸ԰� PX");
	}
	
	@Override
	public void sleep() {
		System.out.println("�Ϸ� ���� �ܴ�");
	}
	
	@Override
	public void play() {
		System.out.println("�Ϸ� ���� ���");
	}
	
}
