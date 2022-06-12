package day18;

import java.util.Random;

class Avengers{
	public void fight() {
		System.out.println("Avengers Assemble");
	}
}

class IronMan extends Avengers{
	@Override
	public void fight() {
		System.out.println("Beam!!");
	}
}

class Thor extends Avengers{
	@Override
	public void fight() {
		System.out.println("Thunder from Hammer");
	}
}

class Hulk extends Avengers{
	@Override
	public void fight() {
		System.out.println("Big green monster");
	}
}

class CaptainAmerica extends Avengers{
	@Override
	public void fight() {
		System.out.println("Throw the SHIELD");
	}
}


class HawkEye extends Avengers{
	@Override
	public void fight() {
		System.out.println("Arrow Bomb!");
	}
	
}

class BlackWidow extends Avengers{
	@Override
	public void fight() {
		System.out.println("kick! and Punch");
	}	
}

class Loki extends Avengers{
	@Override
	public void fight() {
		System.out.println("Duplication!");
	}
}



public class Polymorphism {
	//Loki �� �� break�� �ݺ��� Ż���ϰ� �ϱ�
	public boolean whoAreyou(Avengers a){
		boolean isLoki = false;
		if(a instanceof IronMan) {
			System.out.println("I AM IRONMAN");
		}else if(a instanceof Thor) {
			System.out.println("I AM Thor");
		}else if(a instanceof CaptainAmerica) {
			System.out.println("I AM CaptainAmerica");
		}else if(a instanceof Hulk) {
			System.out.println("I AM Hulk");
		}else if(a instanceof BlackWidow) {
			System.out.println("I AM BlackWidow");
		}else if(a instanceof HawkEye) {
			System.out.println("I AM HawkEye");
		}else if(a instanceof Loki) {
			System.out.println("We Found Loki");
			isLoki = true;
		}else {
			System.out.println("Villain!!");
		}
		return isLoki; 
	}
	
	
	
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		Random r = new Random();
		Avengers[] avengers= {
				new IronMan(),
				new Thor(),
				new CaptainAmerica(),
				new HawkEye(),
				new Hulk(),
				new BlackWidow(),
				new Loki()
		};
		
		for (int i = 0; i < 10; i++) {
			int index = r.nextInt(6); //IronMan~Loki ����
			if(p.whoAreyou(avengers[index])) break; //Polymorphism�� avengers[�ε�����]
			try {
				Thread.sleep(500); // ����Ű:  ���� �巡�� �� alt + shift + z => try cat ����
			} catch (InterruptedException e) {}
		}
		
		
	}
}















