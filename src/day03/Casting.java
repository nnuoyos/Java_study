package day03;

public class Casting {
	public static void main(String[] args) { // �޼���-����

		String num1 = "1";
		String num2 = "2";
		int num3 = 3;

		// �ڵ� ����ȯ
		System.out.println(11 / 9);
		System.out.println(11 / 9.0);
		// ���� ���� 1.2222222222222223 ���� 3���� ������ ���� �Ǽ��� �����̴� ���ѼҼ��̹Ƿ�

		// ���� ����ȯ(Casting)
		System.out.println((double) 11 / 9);
		System.out.println((int) 8.43 + 2.59);
		System.out.println((int) (8.43 + 2.59));
		// �ֿ켱������ ���� ���� �� �Ŀ� ��������ȯ�� �̷�����. ���� ���� �Ŀ� ������ ����ȯ �� 11
		System.out.println((int) 8.43 + (int) 2.59);
		// ����ȯ�� ���� �ϰ� ���� �� ���� ���� �ȴ� ���� 10

		// ���ڿ� ����ȯ
		System.out.println(num1 + num2);
		// ���ڿ� ���ϱ� ���ڿ��� ����!
		// String�� �Ϲ� Ÿ���� �ƴ϶�, Ŭ����Ÿ������ ����ȯ�� �����ϴ� int�� Ŭ����Ÿ���� �����
		System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
		System.out.println(""+num3+9); //������ ���ڿ��� �ٲٴ� ���
		
	}
}
