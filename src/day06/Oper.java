package day06;

public class Oper {
	public static void main(String[] args) {
		int money = 1_000_000_000; //ū ���ڸ� ǥ���� ���� ����ٷ� �����Ѵ�
		int data=10;
		money += 50_000_000;
		
		//data += 1;
		//data++;
		System.out.println(data++); //������
		System.out.println(++data); //������
	}
}
