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
	
	@Override //재정의
	public String toString() {
			return "이름: " + name + "\n나이: " + age + "살\n먹이: " + feed;
	}
}


public class ArrInstance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal[] arAni=new Animal[3];
		//Animal 타입의 3칸 짜리 배열이 힙영역에 생성됨. 그 시작을 arAni라는 배열명이 갖고 있다
		
		String name = "";
		int age=0;
		String feed;
		
		//생성자를 통해 초기화 시키기
		for (int i = 0; i < arAni.length; i++) {
			System.out.println(i+1+"번 동물의 이름: ");
			name = sc.next();
			System.out.println("나이: ");
			age=sc.nextInt();
			System.out.println("먹이: ");
			feed=sc.next();
			arAni[i]= new Animal(name, age, feed);
		}
		
		//for (int i = 0; i < arAni.length; i++) { 
			//매 반복마다 i번에 있는 것을 객체화 시켜줘야 한다 
			//항상 new스캐너 생성자를 호출해야 힙메모리에 할당 되는데 new생성자를 호출 안하면 이름만 떠있는 null값이다 
			//arAni[i] = new Animal(); //Animal공간이 힙메모리에 할당 됨
			//System.out.println(i+1+"번 동물의 이름: ");
			//arAni[i].name=sc.next(); //입력 받은 이름을 배열.name에 바로 저장
			//System.out.println(arAni[i].name + "나이: ");
			//arAni[i].age = sc.nextInt();
			//System.out.println(arAni[i].name + "먹이: ");
			//arAni[i].feed=sc.next();
		//}
		
		for (int i = 0; i < arAni.length; i++) {
			System.out.println(arAni[i]);
		}
		
	}
}
