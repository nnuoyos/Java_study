package marker;

public class Check {
	public static void main(String[] args) {
		Digimon d = new Digimon();
		Pokemon p = new Pokemon();
		ZzangGu z = new ZzangGu();
		HarryPotter h = new HarryPotter();
		
		if(d instanceof Animation) {
			System.out.println("�������� �ִϸ��̼� �Դϴ�.");
		}
		if(p instanceof Animation) {
			System.out.println("���ϸ��� �ִϸ��̼� �Դϴ�.");
		}
		if(z instanceof Animation) {
			System.out.println("¯���� �ִϸ��̼� �Դϴ�.");
		}
		if(!(h instanceof Animation)) {
			System.out.println("�ظ����ʹ� �ִϸ��̼��� �ƴմϴ�.");
		}

	}
}
