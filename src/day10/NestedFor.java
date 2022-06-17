package day10;

public class NestedFor {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d*%d=%d\n", i, j, i*j);
			}
			System.out.println(); //한 단이 끝날때 마다 줄 바꿈
		}
		
	}
}
