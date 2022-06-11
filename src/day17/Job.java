package day17;

import java.util.Random;

class Person{
	String name;
	int age;
	String gender;
	int money;
	
	public Person() {
		
	}
	
	public Person(String name, int age,String gender, int money) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.money=money;
	}
	
}

//Person�� ��� ���� Teacher
class Teacher extends Person{ 
	String subject;
	String position;
	int cnt=0; //���� 10�� �� �� ���� ���� �ö󰡵��� cnt
	
	private int income=10_000_000;
	
	public Teacher(String name,  int age, String gender, int money, String position) {
		super(name, age,gender, money); //�θ� �����ڸ� ����ó�� �� �� �ִ�
		this.position = position;
	}
	
	void teach(String subject) {
		cnt++;
		if(cnt % 10 ==0) income *= 1.1; //cnt�� 10ȸ�� �ش��� ��, �� 10�� ����϶� ���� �ӱ��� 1.1 �����ش�
		
		this.subject=subject; //subject ���⼭ �ʱ�ȭ , �ܺο��� �������� �޾ƿð���
		
		money += income;
		System.out.println(name +" " + this.position +"��(��)" + this.subject+"��(��) ������");
		System.out.println("���� �ܰ�: " +money + "��");
		//this. ���� �Ⱦ����� ���̴�? ���������� �̸��� �������� �̸��� ������ this�� ���ִ� ���� ��Ģ (�����ؾ� �ϹǷ�)
		//�� �ܿ��� ��������� �𽺸� ��Ÿ���� ������ �ᵵ �ǰ� �Ⱦ��� ������ ��.
	}
	
}


public class Job {
	public static void main(String[] args) {
		Teacher ȫ�浿 = new Teacher("ȫ�浿", 20, "����", 0, "����");
		//��Ģ�� ���� ���� ��Ģ���� �ο��Ϸ���? �迭�� �������!
		String[] arSub = {"java", "c���", "���̽�"};
		Random r = new Random();
		int index=0;
		index = r.nextInt(3); //0~2������ ������ ��
		
		for (int i = 0; i < 10; i++) {
			ȫ�浿.teach(arSub[index]);
			//����� 1000(1��) �� �ϳ��� �ܼ�â�� ��� �ȴ�
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		
		}
	}
}








