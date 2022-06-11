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

//Person을 상속 받은 Teacher
class Teacher extends Person{ 
	String subject;
	String position;
	int cnt=0; //강의 10개 할 때 마다 월급 올라가도록 cnt
	
	private int income=10_000_000;
	
	public Teacher(String name,  int age, String gender, int money, String position) {
		super(name, age,gender, money); //부모 생성자를 내것처럼 쓸 수 있다
		this.position = position;
	}
	
	void teach(String subject) {
		cnt++;
		if(cnt % 10 ==0) income *= 1.1; //cnt가 10회씩 해당할 때, 즉 10의 배수일때 마다 임금을 1.1 곱해준다
		
		this.subject=subject; //subject 여기서 초기화 , 외부에서 랜덤으로 받아올것임
		
		money += income;
		System.out.println(name +" " + this.position +"이(가)" + this.subject+"을(를) 강의중");
		System.out.println("통장 잔고: " +money + "원");
		//this. 쓰고 안쓰고의 차이는? 지역변수의 이름과 전역변수 이름이 같을때 this를 써주는 것이 원칙 (구분해야 하므로)
		//그 외에는 명시적으로 디스를 나타내고 싶으면 써도 되고 안쓰면 생략된 것.
	}
	
}


public class Job {
	public static void main(String[] args) {
		Teacher 홍길동 = new Teacher("홍길동", 20, "남자", 0, "강사");
		//규칙성 없는 값에 규칙성을 부여하려면? 배열을 사용하자!
		String[] arSub = {"java", "c언어", "파이썬"};
		Random r = new Random();
		int index=0;
		index = r.nextInt(3); //0~2까지의 랜덤한 수
		
		for (int i = 0; i < 10; i++) {
			홍길동.teach(arSub[index]);
			//결과가 1000(1초) 에 하나씩 콘솔창에 출력 된다
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		
		}
	}
}








