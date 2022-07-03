package day20;

public interface Soldier {
	int arms=2;
	final static int legs=2;
	
	abstract void eat(); //미구현 된 추상메서드
	void work();
	void play();
	void sleep();
	void salute();
}
