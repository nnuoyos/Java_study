package day17;

import java.util.Scanner;

class Animal{
	String name;
	int age;
	String feed;
	
	public Animal() {
		
	}
	
	public Animal(String name, int age, String feed) {
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
	
	@Override //������
	public String toString() {
			return "�̸�: " + name + "\n����: " + age + "��\n����: " + feed;
	}
}


public class ArrInstance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal[] arAni=new Animal[3];
		//Animal Ÿ���� 3ĭ ¥�� �迭�� �������� ������. �� ������ arAni��� �迭���� ���� �ִ�
		
		String name = "";
		int age=0;
		String feed;
		
		//�����ڸ� ���� �ʱ�ȭ ��Ű��
		for (int i = 0; i < arAni.length; i++) {
			System.out.println(i+1+"�� ������ �̸�: ");
			name = sc.next();
			System.out.println("����: ");
			age=sc.nextInt();
			System.out.println("����: ");
			feed=sc.next();
			arAni[i]= new Animal(name, age, feed);
		}
		
		//for (int i = 0; i < arAni.length; i++) { 
			//�� �ݺ����� i���� �ִ� ���� ��üȭ ������� �Ѵ� 
			//�׻� new��ĳ�� �����ڸ� ȣ���ؾ� ���޸𸮿� �Ҵ� �Ǵµ� new�����ڸ� ȣ�� ���ϸ� �̸��� ���ִ� null���̴� 
			//arAni[i] = new Animal(); //Animal������ ���޸𸮿� �Ҵ� ��
			//System.out.println(i+1+"�� ������ �̸�: ");
			//arAni[i].name=sc.next(); //�Է� ���� �̸��� �迭.name�� �ٷ� ����
			//System.out.println(arAni[i].name + "����: ");
			//arAni[i].age = sc.nextInt();
			//System.out.println(arAni[i].name + "����: ");
			//arAni[i].feed=sc.next();
		//}
		
		for (int i = 0; i < arAni.length; i++) {
			System.out.println(arAni[i]);
		}
		
	}
}
